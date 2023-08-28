package com.ashokit.jdbc;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PreparedStatementCustomerSelectBlobClobDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
		
		//Step-1 : Registering the JDBC Driver with DriverManager
		Class.forName("oracle.jdbc.driver.OracleDriver");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//try with Resources from Java7 Version
		try(
		  //Step-2 : Getting the Database Connection object using DriverManager Service		
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	
		 //Step-3 : Getting the Statement Object using Connection Object
		 PreparedStatement  pstmt = connection.prepareStatement("select customer_name,customer_location,bill_amount,"
		 													  + "profile_img,customer_feedback from ashokit_customers "
		 													  + "where customer_id=?");
	     
		 //Reading the inputs into Java Application
		 Scanner sc = new Scanner(System.in);
		 
		 //Creating FileOutputStream object
		 FileOutputStream fos = new FileOutputStream("src/test_User.jpg");	
				
		 //Creating FileWriter Class object
		 FileWriter fw = new FileWriter("src/customer_feeback.txt");
				
		){
			//Reading the Inputs from Keyboard
			System.out.println("Enter Customer-ID to Retreive the Record");
			int customerId = sc.nextInt();
			 
			//Setting values to PlaceHolder
			pstmt.setInt(1, customerId);
			
			//Executing the query
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
			  System.out.println(rs.getString(1)+"===="+ rs.getString(2)+"===="+rs.getString(3));
			  
			  Blob imageBlob = rs.getBlob(4);
			  if(imageBlob != null) {
				  //converting the blob into bytearray
				  byte[] byteArrayOfImage = imageBlob.getBytes(1, (int)imageBlob.length());
				  fos.write(byteArrayOfImage);
			  }
			  
			  Clob clob = rs.getClob(5);
			  if(clob != null) {
				  Reader readerObj = clob.getCharacterStream();
				  int i = 0;
				  while((i = readerObj.read()) != -1) {
					  fw.write(i);
				  }
			  }	
			  System.out.println("Please Verify Output on Console and Observe the Location....");
			}else {
			  System.out.println("Supplied Customer-ID is Not Present......");
			}			
				
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}