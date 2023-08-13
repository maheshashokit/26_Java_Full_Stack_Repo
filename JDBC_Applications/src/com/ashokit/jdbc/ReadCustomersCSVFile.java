package com.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ReadCustomersCSVFile {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Locating the File using FileReader(Character Orientied Stream)
		try( FileReader fr = new FileReader("src/customers.csv");
			 //Passing the FileReader object into BufferedReadera to read the data line by line
			 BufferedReader br = new BufferedReader(fr);
			 //Getting the Database Connection
			 Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			//creating the Statement object
			 Statement st = con.createStatement();
		  ){
			
			 //Reading the First Line from BufferedReader
			 String currentLine = br.readLine();
			 
			 int totalRecordsProcessed = 0;
			 int noOfCustomersFromCSVFile = 0;
			 while(currentLine != null) {

				 //Spliting the current Line 
				 noOfCustomersFromCSVFile++;
				 String[] customerValues = currentLine.split(",");
				 String insert_query = "insert into ashokit_customers values("+customerValues[0]+",'"+customerValues[1]+"','"+customerValues[2]+"')";
				 
				 //executing the query
				  int rowAffected = st.executeUpdate(insert_query);
				  
				  if(rowAffected != 0) {
					  totalRecordsProcessed  = totalRecordsProcessed + rowAffected;
				  }
				  //updating the currentLine for reading next Lines
				  currentLine = br.readLine();
			 }
			 if(noOfCustomersFromCSVFile  == totalRecordsProcessed) {
			   System.out.println("All Records are inserted into Database from CSV File Successfully......");	 
			 }
		}catch(Exception e) {
			System.out.println("IO Resources Error......");
			e.printStackTrace();
		}
		
	}

}
