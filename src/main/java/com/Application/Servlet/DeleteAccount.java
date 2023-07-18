package com.Application.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.apache.tomcat.util.http.parser.Cookie;

import com.Application.Database.AccountDeleteDatabase;
import com.Application.Users.DeleteAccountUsers;

/**
 * Servlet implementation class DeleteAccount
 */
public class DeleteAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAccount() {
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
		String answer = request.getParameter("yes_no");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		if(answer.equals("yes")) {
			
			DeleteAccountUsers account = new DeleteAccountUsers(username);
			AccountDeleteDatabase data = new AccountDeleteDatabase();
			String result = data.accountDelete(account);
			if(result.equals("Account deleted")) {
				response.sendRedirect("Succesfully.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}
			
		}
	}

}
