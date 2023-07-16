package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InstanceMethodReferencesDemo {
	
	public static void main(String[] args) {

		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		//creating the object of our class
		InstanceMethodReferences imr = new InstanceMethodReferences();
		
		//Writing the implementation using lambdaExpression
		Predicate<String> nameCheck = name  -> {return name.length() > 0;};
		System.out.println("Test:::" + nameCheck.test("Mahesh"));
		
		//Writing the implementation using instance method references
		Predicate<String> namecheck1 = imr :: nameLengthChecking;
		System.out.println("Testing:::" + namecheck1.test("Suresh"));
		
		Function<String,String> nameFunction = imr :: nameConversion;
		System.out.println(nameFunction.apply("Mahesh"));
		
		String[] names= {"Ramesh","Suresh","Mahesh","Ashok"};
		Integer[] nos = {10,20,30};
		Arrays.stream(names)
		.forEach(eachElement-> System.out.println(eachElement));
		Arrays.stream(nos)
		.forEach(eachNumber-> System.out.println(eachNumber));
		
		//UserDefined Static Method Reference used in map() stream operation
		Arrays.stream(names).map(StaticMethodReferences::nameConversion)
		.forEach(eachElement -> System.out.println(eachElement));
		
		//Predefined Class Arbitary instance of methods of Predefined class
		Arrays.stream(names).map(String::toUpperCase)
	    .forEach(eachElement -> System.out.println(eachElement));
		
		employees.stream().map(Employee :: getEmpName)
		.forEach(eachElement -> System.out.println(eachElement));
		
		System.out.println("************************************");
		Arrays.stream(names)
		.forEach(System.out::println);
		Arrays.stream(nos)
		.forEach(System.out::println);
	}
}