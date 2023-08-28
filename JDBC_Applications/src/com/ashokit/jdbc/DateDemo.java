package com.ashokit.jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println("Current Date::::" + d);
		
		//My Requirement to be format the date i.e,14-Aug-2023
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String formattedDate = sdf.format(d);
		System.out.println("Formatted Date::::" + formattedDate);
	}

}
