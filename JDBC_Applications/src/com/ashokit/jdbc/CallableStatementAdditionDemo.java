package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementAdditionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Scanner sc = new Scanner(System.in);
				
			CallableStatement cstmt = con.prepareCall("{call addition_two_numbers(?,?,?)}");
				
		   ){
			
			System.out.println("Enter First Value For Addition....");
			int a = sc.nextInt();
			System.out.println("Enter Second Value For Addition......");
			int b = sc.nextInt();
			
			//Registering the output parameter
			cstmt.registerOutParameter(3, Types.INTEGER);
			
			//Registering the input parameters
			cstmt.setInt(1,a);
			cstmt.setInt(2, b);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Procedure Executed Successfully");
				
				//collect output variable values
				int sumOfNumbers = cstmt.getInt(3);
				
				System.out.println("Addition Of two Numbers::::" + sumOfNumbers);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
