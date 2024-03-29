package com.ashokit.collections;

public class Employee implements Comparable<Employee>{
	
	private Integer empId;
	private String empName;
	private String location;
	private String gender;

	public Employee() {
		System.out.println("!23232323232323");
	}
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee(int empId, String empName,String location) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}
	
	public Employee(int empId, String empName,String location,String gender) {
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
	public int compareTo(Employee obj) {
		//below compareTo() is coming from java.lang.String class
		//return this.getLocation().compareTo(obj.getLocation());
		
		//below compareTo() is coming from java.lang.String class
		return this.getEmpId().compareTo(obj.getEmpId());
	}
}
