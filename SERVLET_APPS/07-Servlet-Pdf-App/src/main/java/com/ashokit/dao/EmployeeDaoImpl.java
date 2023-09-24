package com.ashokit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ashokit.model.Employee;
import com.ashokit.util.ConnectionUtils;

public class EmployeeDaoImpl implements EmployeeDao {

	//Getting Database connection from connectionUtils
	private Connection con = ConnectionUtils.getConnection();
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		if (con != null) {
			try (Statement st = con.createStatement();
				 ResultSet rs = st.executeQuery("select * from ashokit_employee");) {
				// Processing the ResultSet
				while (rs.next()) {
					Employee e = new Employee();
					e.setEmployeeId(rs.getInt(1));
					e.setEmployeeName(rs.getString(2));
					e.setEmployeeEmail(rs.getString(3));
					e.setEmployeeDeparment(rs.getString(4));

					// adding employee object to ArrayList
					employeeList.add(e);
				}
			} catch (SQLException e) {
				System.out.println("Database Error!!!!!");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return employeeList;
	}

	@Override
	public List<Employee> getAllEmployeeBasedOnDepartment(String departmentName) {
		// get All the Employees From database
		List<Employee> employeeList = getAllEmployees();

		// Using Java8 Will filter the employees based on department
		return employeeList.stream()
				.filter(e -> departmentName.toUpperCase().equals(e.getEmployeeDeparment().toUpperCase()))
				.collect(Collectors.toList());

	}

}
