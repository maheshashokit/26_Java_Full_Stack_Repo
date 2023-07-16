package com.ashokit.collections;

public class EmployeeDTO {
	
	private int empId;
	private String empName;
	private String location;

	public EmployeeDTO() {
	}
	
	public EmployeeDTO(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public EmployeeDTO(int empId, String empName,String location) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
}
