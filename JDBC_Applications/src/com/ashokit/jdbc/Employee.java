package com.ashokit.jdbc;

public class Employee {
	
	private Integer employeeId;	
	private String employeeName;	
	private String location;
	
	public Employee() {
		
	}

	public Employee(Integer employeeId, String employeeName, String location) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.location = location;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location + "]";
	}
}
