package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeSalarySelectDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		  
		  Statement st = con.createStatement();	
				
		  Scanner sc = new Scanner(System.in);
		
		){
			System.out.println("Enter Range of Salary To Retreive The Employee Records");
			int salaryRange = sc.nextInt();
			
			String select_salary_query ="select empno,ename,job,sal from emp where sal <="+salaryRange +" order by ename";
			System.out.println(select_salary_query);
			
			try(ResultSet rs = st.executeQuery(select_salary_query);){
				//processing the ResultSet Object
				while(rs.next()) {
					//processing the current row of ResultSet object
					System.out.println(rs.getRow() +"---"+ rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
					                   rs.getString(3) +"--"+ rs.getString(4));
				}
			}catch(Exception e) {
				System.out.println("Error in Resulset in try with Resource");
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
