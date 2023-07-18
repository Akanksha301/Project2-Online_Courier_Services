package com.Application.Database;
import java.sql.* ;

import com.Application.Users.ApplicationUsers;

public class RegistrationDatabase {
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
	
	public String insert(ApplicationUsers Users) {
		
		loadDriver(driver);
		Connection conn = getConnection();
		
		String Query = "insert into user_register values (?,?,?,?,?,?,?)" ;
		String result = "Data Entered Succesfully" ;
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(Query);
			
			ps.setString(1, Users.getName());
			ps.setLong(2, Users.getContact());
			ps.setString(3, Users.getCountry());
			ps.setString(4, Users.getState());
			ps.setString(5, Users.getCity());
			ps.setString(6, Users.getUsername());
			ps.setString(7,Users.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered" ;
		}
		
		return result ;
	}
}
