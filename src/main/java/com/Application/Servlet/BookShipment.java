package com.Application.Servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Application.Database.ShipmemtBookingDatabase;
import com.Application.Users.shipmentBookings;

/**
 * Servlet implementation class BookShipment
 */
public class BookShipment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookShipment() {
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
		
		if(username == null && password == null) {
			response.sendRedirect("AskLogin.jsp");
		}
		else {

		 
		java.util.Date date = new java.util.Date();
		
		
		String Username = username ;
		String timeDate = date.toString() ;
		String paddress = request.getParameter("paddress");
		String pcountry = request.getParameter("pcountry");
		long ppincode = Long.parseLong(request.getParameter("ppincode"));
		String daddress = request.getParameter("daddress");
		String dcountry = request.getParameter("dcountry");
		long dpincode = Long.parseLong(request.getParameter("dpincode"));
		double height = Double.parseDouble(request.getParameter("height"));
		double width = Double.parseDouble(request.getParameter("width"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		String deliverytype = request.getParameter("radio");
		
		shipmentBookings book = new shipmentBookings(Username, timeDate, paddress, pcountry, ppincode, daddress, dcountry, dpincode, height, width, weight, deliverytype);
		ShipmemtBookingDatabase data = new ShipmemtBookingDatabase();
		String result = data.insertdata(book);
		
		if(result.equals("Data Entered Succesfully")) {
			response.sendRedirect("ShipBookSuccess.jsp");
		}
		else {
			response.sendRedirect("Error.jsp");
		}
	}
	}	
}
