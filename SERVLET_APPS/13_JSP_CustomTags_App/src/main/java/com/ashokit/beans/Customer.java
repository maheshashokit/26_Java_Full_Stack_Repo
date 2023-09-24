package com.ashokit.beans;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerLocation;
	
	public Customer(String customerId,String customerName,String customerLocation) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
}
