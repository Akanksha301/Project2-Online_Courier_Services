package com.Application.Users;

public class UserCancelShipment {
	String username ;
	int orderid ;

	

	public UserCancelShipment(String username, int orderid) {
		super();
		this.username = username;
		this.orderid = orderid;
	}

	public UserCancelShipment() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	
}
