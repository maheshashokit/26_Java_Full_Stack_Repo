package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSelectResultSetTypesDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String select_query ="select empno,ename,job,sal from emp";		
		
		try(
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		  
		  Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);	
		
		  ResultSet rs = st.executeQuery(select_query);
		){
			//processing the ResultSet Object towards from Top to Bottom
			while(rs.next()) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			System.out.println();
			//processing the ResultSet Object towards from Bottom to Top
			while(rs.previous()) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			System.out.println();
			if(rs.absolute(6)) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			if(rs.absolute(-5)) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			if(rs.relative(-3)) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			if(rs.relative(5)) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			//moving the cursor from Current Point To BFR Location
			rs.beforeFirst();
			System.out.println("Checking Cursor is in BFR or Not::::" + rs.isBeforeFirst());
			rs.afterLast();
			System.out.println("Checking Cursor is in ALR or Not::::" + rs.isAfterLast());
			
			if(rs.first()) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			if(rs.last()) {
				//processing the current row of ResultSet object
				System.out.println(rs.getRow()+"---"+rs.getString(1) +"--"+ rs.getString(2)+"--"+ 
				                   rs.getString(3) +"--"+ rs.getString(4));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
