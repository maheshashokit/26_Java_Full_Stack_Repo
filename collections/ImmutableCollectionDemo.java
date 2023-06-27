package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;

public class ImmutableCollectionDemo {
	
	public static void main(String[] args) {
		
		//Existing arrayList
		 List course = new ArrayList();
		 course.add("JFSD");
		 course.add("SBMS");
		 
		//Java9 Style for Creating Immutable Collection (or) Readonly Collection
		List namesList = List.of("Mahesh","Suresh","Rajesh","Ramesh","Mahesh","Suresh","Rajesh","Ramesh","Mahesh","Suresh","Rajesh","Ramesh");
		System.out.println("Names List:::::" + namesList);
		System.out.println("Names List Size:::::" + namesList.size());
		//namesList.add("Ashok");
		
		List unmodifiedCourseList = List.of(course);
		System.out.println("Unmodified Course List:::::" + unmodifiedCourseList);
		
	}

}
