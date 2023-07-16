package com.ashokit.collections;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties props = new Properties();

		// adding the data into properties object
		props.setProperty("Username", "Mahesh");
		props.setProperty("Password", "Mahesh");
		props.setProperty("Gender", "Male");
		props.setProperty("Designation", "Software Engineer");
		props.setProperty("Test", "Mahesh Test");

		// getting the properties
		String propertyValue = props.getProperty("Username1");
		System.out.println("Username Value:::::" + propertyValue);
		Object object = props.getOrDefault("Test", "Default Value For Test");
		System.out.println("Object Value::::" + object.toString());

		System.out.println(props);
		
		//Reading the properties file data into props object
		try(//FileReader fr = new FileReader("src/Database.properties");
			  FileInputStream fr = new FileInputStream("src/Database.properties");){
			
			//Creating the properties object
			Properties applicationConfig = new Properties();
			//loading the Properties file content into applicationconfig properties object
			applicationConfig.load(fr);
			//reading the data from properties file based on key
			System.out.println("Database UserName::::" + applicationConfig.getProperty("DatabaseUserName"));
			System.out.println("Database Password::::" + applicationConfig.getProperty("DatabasePassword"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}