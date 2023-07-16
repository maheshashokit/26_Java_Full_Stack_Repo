package com.ashokit.collections;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Wanted to display the names whose names length <=4
public class StreamFilterDemo {
	
	public static void main(String[] args) {
		
		//creating the collection for holding the data
		List<String> names = List.of("Suresh","Mahesh","Rajesh","Anil","Balu");
		
		//1.Traditional Approach we can do any approach
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String currentName = iterator.next();
			if(currentName.length() <=4) {
				System.out.println("Employee Name::::" + currentName);
			}
		}
		System.out.println("****************************************");
		//2.Fulfill the task by using Java8 Streams
		
		//converting the collection object into stream of elements
		Stream<String> namesStreams = names.stream();
		
		//Displaying the all the stream elements
		//Defining the Consumer Functional Interface for displaying string values
		Consumer<String> displayStringConsumer =
				(empName) -> System.out.println("Employee Name:::::" + empName);
		
		Consumer<Employee> displayEmpConsumer =
				(emp) -> System.out.println(emp.getEmpId()+"===="+ emp.getEmpName()+"====" +emp.getLocation());		
		
		//Defining the Predicate for Filtering the Employee Names
		Predicate<String> nameLengthPredicate = (empName) -> {
			return empName.length() <= 4;
		};
		
		Predicate<Employee> employeeLocationPredicate = (emp) -> {
			return "HYDERABAD".equals(emp.getLocation().toUpperCase());
		};
		
		//Filtering the Employee Names
		Stream<String> filteredData = namesStreams.filter(nameLengthPredicate);
		
		//Displaying the filtered Data elements from Stream
		filteredData.forEach(displayStringConsumer);
		
		System.out.println("**********************************************************");
		
		names
		.stream()
		.filter((empName) -> {
			return empName.length() <= 4;
		})
		.forEach((empName) -> System.out.println("Employee Name:::::" + empName));
	}
}