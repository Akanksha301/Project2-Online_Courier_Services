package com.Application.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Application.Database.TrackDatabase;
import com.Application.Users.TrackUsers;

/**
 * Servlet implementation class Track
 */
public class Track extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Track() {
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
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		
		int orderid = Integer.parseInt(request.getParameter("orderid"));
		
		if(username != null && password != null) {
			TrackUsers users = new TrackUsers(orderid);
			users.setOrderid(orderid);
			
			TrackDatabase trackDao = new TrackDatabase();
			
			if(trackDao.getOrderId(users)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("TrackShipment.jsp");
				dispatcher.forward(request, response);
			}
			else {
				response.sendRedirect("Error.jsp");
			}
		}
		else {
			response.sendRedirect("AskLogin.jsp");
			
		}
	}
}
