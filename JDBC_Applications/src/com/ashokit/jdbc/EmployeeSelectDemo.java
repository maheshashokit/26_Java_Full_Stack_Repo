package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSelectDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String select_query ="select empno,ename,job,sal from emp";		
		
		try(
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		  
		  Statement st = con.createStatement();	
		
		  ResultSet rs = st.executeQuery(select_query);
		){
			//processing the ResultSet Object
			while(rs.next()) {
				//processing the current row of ResultSet object
				System.out.println(rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
