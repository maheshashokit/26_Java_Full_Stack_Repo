package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

//Checking the Database Connection is getting or not...
public class ConnectionTestJdbcProgram {

	public static void main(String[] args) {
		try {

			// Step-1 : Registering the JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Step-2 : Getting the Connection Object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

			// Checking the connection object
			if (con != null) {
				System.out.println("Oracle Database Got Connected Successfully......");
			}
			
			String value ="Mahesh@ashokit";
			Encoder encoder = Base64.getEncoder();
			String encodedValue = encoder.encodeToString(value.getBytes());
			System.out.println(encodedValue);
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}