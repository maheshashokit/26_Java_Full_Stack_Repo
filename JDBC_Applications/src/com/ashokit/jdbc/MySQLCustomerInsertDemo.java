package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MySQLCustomerInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/26_advancedjava", "root", "root");
			
			PreparedStatement pstmt = con.prepareStatement("insert into maheshit_customers(customer_name,customer_location) values(?,?)");
			
			Scanner sc = new Scanner(System.in);	
		   ){
				 System.out.println("Enter Customer Name");
				 String customerName = sc.next();
				 System.out.println("Enter Customer Location");
				 String customerLocation = sc.next();
				 
				 //setting values
				 pstmt.setString(1, customerName);
				 pstmt.setString(2,customerLocation);
				 
				 //executing the query
				 int rowCount = pstmt.executeUpdate();
				 
				 //processing rowCount
				 if(rowCount != 0) {
					 System.out.println("Database Row Got Inserted........");
				 }else {
					 System.out.println("Database Row Not Inserted........");
				 }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
