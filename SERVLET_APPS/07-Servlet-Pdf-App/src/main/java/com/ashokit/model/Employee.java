package com.ashokit.model;

public class Employee {

	private int employeeId;

	private String employeeName;

	private String employeeEmail;

	private String employeeDeparment;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeDeparment(String employeeDeparment) {
		this.employeeDeparment = employeeDeparment;
	}
	
	public String getEmployeeDeparment() {
		return employeeDeparment;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeDeparment=" + employeeDeparment + "]";
	}	
}
