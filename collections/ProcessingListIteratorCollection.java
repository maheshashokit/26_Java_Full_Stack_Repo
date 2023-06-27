package com.ashokit.collections;

import java.util.ListIterator;
import java.util.Vector;

public class ProcessingListIteratorCollection {

	public static void main(String[] args) {

		// creating the collection object and holding course names
		Vector<String> coursesList = new Vector<>();
		coursesList.add("CoreJava");
		coursesList.add("AdvancedJava");
		coursesList.add("Oracle");
		coursesList.add("AngularJS");
		coursesList.add("ReactJS");

		// Getting the ListIterator object from collection object
		ListIterator<String> courseNames = coursesList.listIterator();

		// processing the courseNames towards Forward Direction
		while(courseNames.hasNext()) {

			// Getting the current CourseName
			String currentCourseName = courseNames.next();
			
			// printing the courseName
			System.out.println("Course Name :::::" + currentCourseName);
			
			// Updating the Logic
			if ("reactjs".equals(currentCourseName.toLowerCase())) {
				courseNames.set("React JavaScript");
			}

			if ("angularjs".equals(currentCourseName.toLowerCase())) {
				courseNames.remove();
			}
		}
		//React JS  >>>> React JavaScript
		//AngularJS Course should be Removed from CourseList
		System.out.println("After Iteration CourseList:::::" + coursesList); 
		System.out.println("****************************************************");

		// processing the courseNames towards Backward Direction
		while (courseNames.hasPrevious()) {

			// Getting the previous element
			String previousCourseName = courseNames.previous();

			// Printing the Previous Course Name
			System.out.println("Previous Course Name :::::" + previousCourseName);
		}
	}
}
