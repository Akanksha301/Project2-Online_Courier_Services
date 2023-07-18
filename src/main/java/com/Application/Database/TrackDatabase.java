package com.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Application.Users.TrackUsers;

public class TrackDatabase {
	
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
	
	public boolean getOrderId(TrackUsers users) {
		loadDriver(driver);
		Connection conn = getConnection();
		
        String Query = "select * from shipment_detail where orderid = ?" ;
		
		boolean result = false ;
		
		try {
			PreparedStatement ps = conn.prepareStatement(Query);
			ps.setInt(1, users.getOrderid());
			
			ResultSet rs = ps.executeQuery();
			
			result = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result ;
	}
}
