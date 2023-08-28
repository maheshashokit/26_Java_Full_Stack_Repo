package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

public class EmployeeBatchInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		List<Employee> employeeList = Arrays.asList(new Employee(01,"Mahesh","Hyderbad"),
				      								new Employee(02,"Suresh","Hyderbad"),
				      								new Employee(03,"Rajesh","Chennai"),
				      								new Employee(04,"Ramesh","Hyderbad"),
				      								new Employee(05,"Umesh","Banaglore"));
		
		
		insertEmployeesAsBatch(employeeList);

	}	
	
	public static void insertEmployeesAsBatch(List<Employee> employees) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try{
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			 
			PreparedStatement pstmt  = con.prepareStatement("insert into ashokit_employees values(?,?,?)");
				
			//iterating the employees
			for(Employee emp :employees) {
				pstmt.setInt(1,emp.getEmployeeId());
				pstmt.setString(2, emp.getEmployeeName());
				pstmt.setString(3, emp.getLocation());
				
				//adding each record into batch
				pstmt.addBatch();
			}			
			
			//executing the batch
			int[] rowCount = pstmt.executeBatch();
			
			int recordsFailed = 0;
			int recordProcessed = 0;
			//processing the rowCount
			for(int i = 0 ; i<rowCount.length ; i++) {				
				if(rowCount[i] == 0) {
					++recordsFailed;
				}else {
					++recordProcessed;
				}				
			}
			System.out.println("Record Processed :::::" + recordProcessed);
			System.out.println("Record Failed    :::::" + recordsFailed);
			//verifying the batch count
			if(employees.size() == recordProcessed) {
				System.out.println("Successfully Processed All Records in Batch....");
			}else {
				System.out.println("Some of Records Got Missed for Processing.....");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
