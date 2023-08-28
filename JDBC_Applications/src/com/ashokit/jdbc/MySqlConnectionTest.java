package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/26_advancedjava", "root", "root");
		
		if(con != null) {
			System.out.println("Connection Success...");
			System.out.println("Connection Implementation Class::::" + con.getClass().getName());
		}else {
			System.out.println("Connection Error....");
		}
	}
}