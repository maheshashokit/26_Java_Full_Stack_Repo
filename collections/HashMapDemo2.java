package com.ashokit.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
		
		Map<String,String> javaTrainers = new HashMap<>();
		//adding the data to map object
		javaTrainers.put("Mahesh","JFSD");
		javaTrainers.put("Ashok","SpringBoot");
		javaTrainers.put("Suresh","WebDevelopment");
		javaTrainers.put("Ramesh","PHP");
		javaTrainers.put("Mahesh","CoreJava");
		System.out.println("JavaTrainers:::::" + javaTrainers);
		System.out.println("JavaTrainers:::::" + javaTrainers.size());
		
	}
}