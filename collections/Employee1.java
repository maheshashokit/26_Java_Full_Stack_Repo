package com.ashokit.collections;

public class Employee1{
	
	private Integer empId;
	private String empName;
	private String location;
	private String gender;

	public Employee1() {
	}
	
	public Employee1(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee1(int empId, String empName,String location) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}
	
	public Employee1(int empId, String empName,String location,String gender) {
		this(empId,empName,location);
		this.gender = gender;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
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
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "EmployeeId="+empId+"&& EmployeeName="+empName;
	}
}
