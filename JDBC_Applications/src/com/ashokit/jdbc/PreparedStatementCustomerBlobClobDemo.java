package com.ashokit.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PreparedStatementCustomerBlobClobDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
		
		//Step-1 : Registering the JDBC Driver with DriverManager
		Class.forName("oracle.jdbc.driver.OracleDriver");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//try with Resources from Java7 Version
		try(
		  //Step-2 : Getting the Database Connection object using DriverManager Service		
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	
		 //Step-3 : Getting the Statement Object using Connection Object
		 PreparedStatement  pstmt = connection.prepareStatement("insert into ashokit_customers values(ashokit_customers_seq.nextval,?,?,?,?,?,?,?,?)");
	     
		 //Reading the inputs into Java Application
		 Scanner sc = new Scanner(System.in);
		){
			//Reading the Inputs from Keyboard
			System.out.println("Enter Customer Name To Insert");
			String custName = sc.next();
			System.out.println("Enter Customer Location To Insert");
			String custLocation = sc.next();
			System.out.println("Enter Customer Bill Amount");
			int custBillAmount = sc.nextInt();
			System.out.println("Enter Date Of Purchase(dd/mm/yyyy)");
			String dateOfPurchase = sc.next();
			java.util.Date purchaseDate = sdf.parse(dateOfPurchase);
			 
			//Setting values to PlaceHolder
			pstmt.setString(1, custName);
			pstmt.setString(2, custLocation);
			pstmt.setInt(3, custBillAmount);
			pstmt.setDate(4, new java.sql.Date(purchaseDate.getTime()));
			pstmt.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
			pstmt.setString(6, "ramesh@ashokit.in");
			
			//setting values for Blob & Clob Items
			File imageFile = new File("D:\\User.jpg");
			FileInputStream imageStreamFile = new FileInputStream(imageFile);
			pstmt.setBinaryStream(7,imageStreamFile,imageFile.length());
			//pstmt.setBinaryStream(7, imageStreamFile);
			
			pstmt.setClob(8, new FileReader("D:\\Clob_Text.txt"));
			
		   //Preparing the SQL Query For Inserting the Record
		   int rowAffected = pstmt.executeUpdate();
		   
		   if(rowAffected != 0) {
			   System.out.println("Query Executed Successfully Please Verify With Database....");
		   }		
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}