package com.ashokit.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {

		List<String> nonTechnicalStaff = new ArrayList<String>();
		nonTechnicalStaff.add("Sarath");
		nonTechnicalStaff.add("Raju");
		nonTechnicalStaff.add("Vijay");
		nonTechnicalStaff.add("Prakash");
		System.out.println("Non Technical Staff::::: " + nonTechnicalStaff);

		// Creating the Set Object with String elements
		Set<String> technicalStaff = new LinkedHashSet<>();
		technicalStaff.add("Suresh");
		technicalStaff.add("Ramesh");
		technicalStaff.add("Nagesh");
		technicalStaff.add("Mahesh");
		technicalStaff.add("Naresh");
		technicalStaff.add("Ashok");
		technicalStaff.add("Ashok");
		technicalStaff.add("Ashok");
		technicalStaff.add("karthik");
		technicalStaff.add("karthik");
		technicalStaff.add("karthik");
		technicalStaff.add("Chanti");
		technicalStaff.add(null);
		System.out.println("Java Trainers in Ashok IT::::" + technicalStaff);

		Set<String> ashokItDetails = new LinkedHashSet<>();
		ashokItDetails.addAll(technicalStaff);
		ashokItDetails.addAll(nonTechnicalStaff);

		System.out.println("Ashok IT Information ::::::" + ashokItDetails);

	    //processing the ashokItDetails
		ashokItDetails.stream().forEach(element -> System.out.println(element));
	}
}
