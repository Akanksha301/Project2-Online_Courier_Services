package com.Application.Users;

public class ApplicationUsers {
	
	String name ;
	long contact ;
	String country ;
	String state ;
	String city ;
	String username ;
	String password ;

	
	
	public ApplicationUsers(String name, long contact, String country, String state, String city, String username,
			String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.country = country;
		this.state = state;
		this.city = city;
		this.username = username;
		this.password = password;
	}

	public ApplicationUsers() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
