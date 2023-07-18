package com.Application.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Application.Database.CancleShipmentDatabase;
import com.Application.Users.UserCancelShipment;

/**
 * Servlet implementation class CancelShipment
 */
public class CancelShipment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelShipment() {
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
		String username = (String)request.getAttribute("username");
		
		String decision = request.getParameter("radio");
		int orderid = Integer.parseInt(request.getParameter("orderid"));
		
		if(decision.equals("yes")) {
			UserCancelShipment users = new UserCancelShipment(username, orderid);
			CancleShipmentDatabase cancel = new CancleShipmentDatabase();
			String result = cancel.update(users);
			
			if(result.equals("Courier Shipment cancel Successfully")) {
				response.sendRedirect("ShipCancelSuccess.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}
			
		}
		else {
			response.sendRedirect("Home.jsp");
		}
	}

}
