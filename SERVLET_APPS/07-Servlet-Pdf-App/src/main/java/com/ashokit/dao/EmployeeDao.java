package com.ashokit.dao;

import java.util.List;

import com.ashokit.model.Employee;

public interface EmployeeDao {
	
	//To get All the Employees from database
	public List<Employee> getAllEmployees();
	
	//To get All the Employees based on given department name
	public List<Employee> getAllEmployeeBasedOnDepartment(String departmentName);
	
}
