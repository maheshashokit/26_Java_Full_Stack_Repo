package com.ashokit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {

	private static Connection connection = null;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		} catch (Exception e) {
			System.out.println("Database Connection Problem!!!!");
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
