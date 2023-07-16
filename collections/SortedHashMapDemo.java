package com.ashokit.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,String> javaTrainers = new TreeMap<>(Comparator.reverseOrder());
		//adding the data to map object
		javaTrainers.put("Mahesh","JFSD");
		javaTrainers.put("Ashok","SpringBoot");
		javaTrainers.put("Suresh","WebDevelopment");
		javaTrainers.put("Ramesh","PHP");
		javaTrainers.putIfAbsent("Mahesh1", "Oracle");
		System.out.println("JavaTrainers:::::" + javaTrainers);
		
		Map<Integer,String> webTrainers = new TreeMap<>(Comparator.reverseOrder());
		webTrainers.put(12312,"HTML");
		webTrainers.put(212,"CSS");
		webTrainers.put(121,"JavaScript");
		System.out.println("WebTrainers :::::::" + webTrainers);
		
	}
}