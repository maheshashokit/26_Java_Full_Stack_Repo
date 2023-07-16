package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ProcessingEnumerationDemo {
	
	public static void main(String[] args) {
		
		// creating the collection object and holding course names
		List<String> coursesList = new ArrayList<>();
		coursesList.add("CoreJava");
		coursesList.add("AdvancedJava");
		coursesList.add("Oracle");
		coursesList.add("AngularJS");
		coursesList.add("ReactJS");
		
		Enumeration<String> courseEnumeration = Collections.enumeration(coursesList);
		while(courseEnumeration.hasMoreElements()) {
			String currentCourse = courseEnumeration.nextElement();
			System.out.println("Course Name ::::" + currentCourse);
		}
		
		System.out.println("********************************************");
		//Generating the 10 Random Numbers
		Vector<Integer> numbers = new Vector<>();
		for(int i = 1; i<=10;i++) {
			numbers.add(new Random().nextInt(1000, 1500));
		}	
		//processing the legacy collection class...
		Enumeration<Integer> enumerationNumbers = numbers.elements();
		while(enumerationNumbers.hasMoreElements()) {
			Integer currentNumber = enumerationNumbers.nextElement();
			System.out.println("Current Number::::" + currentNumber);
		}
    }
}
