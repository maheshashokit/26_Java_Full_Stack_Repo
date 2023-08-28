package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.internal.OracleTypes;

public class CallableStatementCustomersDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			CallableStatement cstmt = con.prepareCall("{call Get_All_Customers(?)}");
		   ){
			
			//Registering the output parameter
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Procedure Executed Successfully");
				
				//collect output variable values
				ResultSet rs  = (ResultSet) cstmt.getObject(1);
				
				while(rs.next()) {
					System.out.println(rs.getString(1)+"----"+rs.getString(2)+"-----"+rs.getString(3)+"------"+ rs.getString(4));
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
