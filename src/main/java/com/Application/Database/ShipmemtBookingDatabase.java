package com.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Application.Users.shipmentBookings;


public class ShipmemtBookingDatabase {
	
		private String url = "jdbc:mysql://localhost:3306/OnlineCourierServices" ;
		private String username = "root" ;
		private String password = "Create@1234" ;
		private String driver = "com.mysql.jdbc.Driver" ;
		
		public void loadDriver(String driver) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public Connection getConnection() {
			Connection conn = null ;
			try {
				conn = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn ;
		}
		
		public String insertdata( shipmentBookings book) {
			
			loadDriver(driver);
			Connection conn = getConnection();
			
			String Query = "insert into shipment_detail values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
			String result = "Data Entered Succesfully" ;
			   
			try {
				PreparedStatement ps = conn.prepareStatement(Query);
				ps.setString(1, book.getUsername());
				ps.setString(2, book.getPaddress());
				ps.setString(3, book.getPcountry());
				ps.setLong(4, book.getPpincode());
				ps.setString(5, book.getDaddress());
				ps.setString(6, book.getDcountry());
				ps.setLong(7, book.getDpincode());
				ps.setDouble(8, book.getHeight());
				ps.setDouble(9, book.getWidth());
				ps.setDouble(10, book.getWeight());
				ps.setString(11, book.getDeliveryType());
				ps.setString(12,book.getDatetime());
				ps.setString(13, "ShipmentOrder");
				ps.setInt(14, 1);
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = "Data not entered" ;
			}
			
			return result ;
		}
}
