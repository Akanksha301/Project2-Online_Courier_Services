package com.Application.Users;

public class LoginUsers {
	String username ;
	String password ;
	
	public LoginUsers(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginUsers() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
