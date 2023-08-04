package com.ashokit.collections;

public class User {
	
	enum UserStatus{
		 ACTIVE,
		 INACTIVE;
	} 

	private String username;
	
	private String password;
	
	//Status is an enum
	private Status status;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username,String password,Status status) {
		this.username = username;
		this.password= password;
		this.status = status;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", status=" + status + "]";
	}
	
	
}
