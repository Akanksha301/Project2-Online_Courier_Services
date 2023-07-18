package com.Application.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Application.Database.LoginDatabase;
import com.Application.Users.LoginUsers;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginUsers users = new LoginUsers();
		users.setUsername(username);
		users.setPassword(password);
		
		
		LoginDatabase loginDao = new LoginDatabase();
		if(loginDao.validate(users)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("username",username);
			session.setAttribute("password",password);
			RequestDispatcher dispatcher = request.getRequestDispatcher("UserDisplay.jsp");
			dispatcher.forward(request, response);
		    
	    }
		else {
        	response.sendRedirect("InvalidDetails.jsp");
		}
	}
}
