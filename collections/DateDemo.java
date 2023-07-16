package com.ashokit.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();

		System.out.println("Current Date::::" + d);

		// we can format the date & time as per your application requirement
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy HH:MM:SS");

		// format is used to format the date by taking date input & return formatted
		// date value
		String formatedDate = sdf.format(d);

		System.out.println("Formatted Date::::" + formatedDate);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMM-yyyy HH:MM:SS");
		Date d1 = sdf1.parse(formatedDate);

		System.out.println("Date value ::::" + d1);
		
		List<String> names = new CopyOnWriteArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Rajesh");
		System.out.println("Before Reverse ::::" + names);
		Collections.reverse(names);
		System.out.println("After Reverse :::::" + names);
		
		//List<String> synchronizedList = Collections.synchronizedList(names);
		for(String name : names) {
			System.out.println(name);
			names.add("New");
		}	
		System.out.println("After List::::" + names);
	}
}