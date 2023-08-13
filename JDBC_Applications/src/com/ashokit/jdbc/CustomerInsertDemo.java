package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerInsertDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
		
		//Step-1 : Registering the JDBC Driver with DriverManager
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//try with Resources from Java7 Version
		try(
		  //Step-2 : Getting the Database Connection object using DriverManager Service		
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	
		 //Step-3 : Getting the Statement Object using Connection Object
		 Statement st = connection.createStatement();
	     
		 //Reading the inputs into Java Application
		 Scanner sc = new Scanner(System.in);
		){
			//Reading the Inputs from Keyboard
			System.out.println("Enter Customer Name To Insert");
			String custName = sc.next();
			System.out.println("Enter Customer Location To Insert");
			String custLocation = sc.next();
			
		   //Preparing the SQL Query For Inserting the Record
		   //String insertQuery = "insert into ashokit_customers values(2,'Ashok','Hyderabad')";
		   String insertQuery = "insert into ashokit_customers values(ashokit_customers_seq.nextval,'"+custName+"','"+custLocation+"')";
		   System.out.println("Insert Query ::::" + insertQuery);
		   
		   //Step-4: Executing the Insert Query using executeUpdate() from Statement object
		   int rowAffected = st.executeUpdate(insertQuery);
		   
		   //Step-5 : Processing the RowAffected Count 
		   if(rowAffected != 0) {
			   System.out.println("Query Executed Successfully Please Verify With Database....");
		   }		
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}