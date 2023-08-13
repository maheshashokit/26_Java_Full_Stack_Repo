package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginSelectDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		try(
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		  
		  Statement st = con.createStatement();
				
		  Scanner sc = new Scanner(System.in);
		  
		){
			System.out.println("Enter Username To Validate");
			String loginId = sc.next();
			System.out.println("Enter Passsword To Validate");
			String loginPwd = sc.next();
			
			String login_query="select count(*) from ashokit_logins where login_id='"+loginId+"' and login_pwd='"+loginPwd+"'";
			
			try(ResultSet rs = st.executeQuery(login_query)){
				
				rs.next(); //moving the ResultSet Pointer from BFR To First Record
				
				//Getting the count value
				int login_count = rs.getInt(1);
				
				//processing the login_count
				if(login_count == 0) {
					System.out.println("Login Failure......");
				}else {
					System.out.println("Login Success......");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
