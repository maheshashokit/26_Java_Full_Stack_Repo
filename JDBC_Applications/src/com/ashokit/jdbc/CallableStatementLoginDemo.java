package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementLoginDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Scanner sc = new Scanner(System.in);
				
			CallableStatement cstmt = con.prepareCall("{call login_process(?,?,?)}");
				
		   ){
			
			System.out.println("Enter Username To Validate");
			String username = sc.next();
			System.out.println("Enter Password To Validate");
			String password = sc.next();
			
			//Registering the output parameter
			cstmt.registerOutParameter(3, Types.VARCHAR);
			
			//Registering the input parameters
			cstmt.setString(1,username);
			cstmt.setString(2,password);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Procedure Executed Successfully");
				
				//collect output variable values
				String loginStatus = cstmt.getString(3);
				System.out.println("Login Status ::::::" + loginStatus);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
