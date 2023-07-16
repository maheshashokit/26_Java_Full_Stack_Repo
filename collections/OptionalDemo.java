package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		 String name = "Mahesh";
		 
		 //creating the Optional Class Object
		
		 //First Approach
		 Optional<Object> emptyOptional = Optional.empty();
		// emptyOptional.of(name);
		 
		 //Second Approach
		 //Optional<String> nameOptional = Optional.of(name);
		 Optional<String> nameOptional = Optional.ofNullable(name);
		 
		 //checking the optional object
		 if(nameOptional.isPresent()) {
			String name1 = nameOptional.get();
			System.out.println("Name From Optional::::" + name1);
		 }else {
			 //Throwing the Exception
			 //Setting value to name;
			 System.out.println("Inside the Else Block.....");
			 throw new NullPointerException("Name Can't be Null....");
		 }
		 
		 /*Employee employee = new Employee(123,"Mahesh","Hyderabad");
		 Employee employee = null;
		 Optional<Employee> empOptional = Optional.ofNullable(employee);
		 empOptional.ifPresent(emp -> System.out.println(emp));
		 empOptional.orElseThrow(() -> {
			throw new NullPointerException("Employee Can't be null...");
		 });
		 
		 System.out.println("*************************");
		 Employee empObj = Optional.ofNullable(employee).orElseThrow(() -> {
			throw new NullPointerException("Employee Can't be null...");
		 });
		 System.out.println(empObj);*/
		 
		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");
		Employee emp5 = new Employee(555, "Ramesh", "Hyderabad1");
		Employee emp6 = new Employee(556, "Ramesh", "Hyderabad2");

		// Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();

		// adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		
		//stream operation
		Optional<Employee> empOpts = employees.stream().findFirst();
		if(!empOpts.isEmpty() && empOpts.isPresent()) {
			Employee emp = empOpts.get();
			System.out.println(emp);
		}
		
	    System.out.println("********************************");
		
	    //using Java8 Stream
		Optional<Employee> findFirst = 
	      employees.stream()
	     .filter(eachEmp -> "RAMESH".equalsIgnoreCase(eachEmp.getEmpName()))
		 .findFirst();
		
		if(findFirst.isPresent()) {
			Employee employee = findFirst.get();
			System.out.println(employee);
		}
		
		long streamCount = employees.stream().count();
		System.out.println("Stream Count::::" + streamCount);
		
		System.out.println("***********************************");
		 Employee[] emps = employees
		.stream()
		.filter(eachEmp -> "RAMESH".equalsIgnoreCase(eachEmp.getEmpName()))
		.toArray(Employee[] :: new);
		 System.out.println("Employee Array Size::::" + emps.length);
		 for(Employee emp : emps) {
			 System.out.println(emp);
		 }
		 
		 System.out.println("**************************************");
		 
		 List<String> empNames = employees.stream()
		 .map(eachEmp -> { return eachEmp.getEmpName().toUpperCase();})
		 .peek(eachName -> { 
			 System.out.println("NOOOOOOOOO");
			 System.out.println(eachName);
		  })
		 .peek(eachName ->{
			 System.out.println("Yewssssssssss");
			 System.out.println(eachName.toLowerCase());
		 })
		 .collect(Collectors.toList());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}