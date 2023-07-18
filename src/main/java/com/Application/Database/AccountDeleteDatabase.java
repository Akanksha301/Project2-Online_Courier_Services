package com.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Application.Users.DeleteAccountUsers;

public class AccountDeleteDatabase {
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
	
	public String accountDelete(DeleteAccountUsers delac){
		loadDriver(driver);
		Connection con = getConnection();
		String Query = " delete from user_register where uusername = ? " ;
		String result = "Account deleted " ;
		
			try {
				PreparedStatement ps = con.prepareStatement(Query);
				ps.setString(1, delac.getUsername());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = "Account not deleted" ;
			}
			
			return result ;
	}	
}
