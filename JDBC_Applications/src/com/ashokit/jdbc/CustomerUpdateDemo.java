package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerUpdateDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
	
		//Step-1: Registering the JDBC Driver With DriverManager Service
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//try with resources from Java7 version
		try(
		  //Step-2 : Getting the Connection object using DriverManager Service
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","manager");
		
		  //Step-3 : Creating the statement object for executing the Update Statement
		  Statement st = con.createStatement();
		
		  Scanner sc = new Scanner(System.in);
		){
		  
		  //Connection & Statement are interfaces from Sun MicroSystem & implementation class will provided by Jdbc Driver vendors
		  System.out.println("Connection Interface Implementation Class::::" + con.getClass().getName());
		  System.out.println("Statement Interface Implementation Class::::" + st.getClass().getName());
			
		  //Collecting the values from user to update the query
		  System.out.println("Enter Customer Location To be Modified");
		  String custLocation = sc.next();
		  System.out.println("Enter Customer ID To be Modified");
		  int customerId=sc.nextInt();
		
		  //Preparing the Update Query
		  String update_query = "update ashokit_customers set customer_location='"+custLocation+"' where customer_id="+customerId;
		  System.out.println("Update Query :::::" + update_query);
		  
		  //Step-4: Executing the Update Query using Statement object
		  int rowAffected = st.executeUpdate(update_query);
		  
		  //Step-5 : Processing the rowAffected Count
		  if(rowAffected != 0) {
			  System.out.println("Customer Row Got update with Customer Id ::::" + customerId);
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}