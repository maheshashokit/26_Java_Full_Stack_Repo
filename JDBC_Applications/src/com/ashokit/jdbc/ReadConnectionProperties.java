package com.ashokit.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConnectionProperties {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		// create an object Properties class
		Properties dbProps = new Properties();

		// loading the properties file using load()
		dbProps.load(new FileInputStream("src/Database.properties"));

		// Accessing the data from properties file
		String jdbcDriver = dbProps.getProperty("OracleJdbcDriver");
		String jdbcUrl = dbProps.getProperty("OracleJdbcUrl");
		String DbUsername = dbProps.getProperty("OracleUsername");
		String DbPassword = dbProps.getProperty("OraclePassword");

		// printing the value on the console
		System.out.println(DbUsername + "----------" + DbPassword);
		System.out.println(jdbcDriver + "----------" + jdbcUrl);
	}

}
