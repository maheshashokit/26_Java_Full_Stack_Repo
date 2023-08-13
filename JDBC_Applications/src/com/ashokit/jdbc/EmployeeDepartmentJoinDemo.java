package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDepartmentJoinDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		  
		  Statement st = con.createStatement();	
				
		  Scanner sc = new Scanner(System.in);
		
		){
			System.out.println("Enter Department Name To Retrieve Employees");
			String departmentName = sc.next();
			
			String emp_dept_join_query ="select e.empno,e.ename,e.sal,e.job,d.dname "
					+ "from emp e join dept d "
					+ "on e.deptno = d.deptno "
					+ "where d.dname='"+departmentName.toUpperCase()+"'";
			System.out.println(emp_dept_join_query);
			
			try(ResultSet rs = st.executeQuery(emp_dept_join_query);){
				//processing the ResultSet Object
				while(rs.next()) {
					//processing the current row of ResultSet object
					System.out.println(rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
					                   rs.getString(3) +"--"+ rs.getString(4)+"--"+
							           rs.getString(5)
							          );
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
