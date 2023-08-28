package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementFunctionCustomerDetailsDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Scanner sc = new Scanner(System.in);
				
			CallableStatement cstmt = con.prepareCall("{? = call Get_Customer_Details_By_Id(?,?)}");
				
		   ){
			
			System.out.println("Enter CustomerId To Fetch Details....");
			int customerId = sc.nextInt();
			
			//Registering the output parameter
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			
			//Registering the input parameters
			cstmt.setInt(2,customerId);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Procedure Executed Successfully");
				
				//collect output variable values
				String customerIdValue = cstmt.getString(1);
				String customerName = cstmt.getString(3);
				System.out.println(customerIdValue+"======"+customerName);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
