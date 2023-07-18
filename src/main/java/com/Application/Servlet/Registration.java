package com.Application.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Application.Database.RegistrationDatabase;
import com.Application.Users.ApplicationUsers;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		long contact = Long.parseLong(request.getParameter("contact"));
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		ApplicationUsers Users = new ApplicationUsers(name,contact,country,state,city,username,password);
		RegistrationDatabase reg = new RegistrationDatabase();
		String result = reg.insert(Users);
		if(result.equals("Data Entered Succesfully")) {
			response.sendRedirect("Succes.jsp");
		}
		else {
			response.sendRedirect("Error.jsp");
		}
		//response.getWriter().print(result);
		
	}

}
