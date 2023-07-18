package com.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Application.Users.UserCancelShipment;

public class CancleShipmentDatabase {
	
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
	
	public String update(UserCancelShipment user){
		loadDriver(driver);
		Connection con = getConnection();
		
		String Query = "update shipment_detail set orderStatus = ? where uusername = ? and orderid = ?" ;
		String result = "Courier Shipment cancel Successfully" ;
		try {
			PreparedStatement ps = con.prepareStatement(Query);
			ps.setString(1, "Cancel Order");
			ps.setString(2, user.getUsername());
			ps.setInt(3, user.getOrderid());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Shipment not cancel" ;
		}
		
	return result;
	}


}
