package com.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Application.Users.LoginUsers;

public class LoginDatabase {
	
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
	
	public boolean validate(LoginUsers users) {
		
		loadDriver(driver);
		Connection conn = getConnection();
		
		String Query = "select * from user_register where uusername = ? and upassword = ? " ;
		
		boolean result = false ;
		
		try {
			PreparedStatement ps = conn.prepareStatement(Query);
			ps.setString(1, users.getUsername());
			ps.setString(2, users.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			result = rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result ;
	}
}
