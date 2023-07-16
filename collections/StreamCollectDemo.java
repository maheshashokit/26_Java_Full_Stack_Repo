package com.ashokit.collections;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {
	
	public static void main(String[] args) {
	
		//List of Integers as String values
		List<String> numbers = List.of("1","2","3","4","5");
		
		//Converting from String to Integer and get the list of even numbers
		List<Integer> evenNumbers = numbers.stream()
				.map(eachNumber ->{ return Integer.valueOf(eachNumber);})
		        .filter(checkNumber -> { return checkNumber % 2 == 0;})
		        .collect(Collectors.toList());
		       // .collect(Collectors.toUnmodifiableList());
		
		//displaying the even numbers using streams
		evenNumbers.stream().forEach(evenNumber -> System.out.println(evenNumber));
		
		System.out.println("***************************************************************");
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		List<Employee> employees = List.of(emp1,emp2,emp3,emp4);
		
		//Getting the Hyderabad Employee object to be seperate List
		List<Employee> hydEmpList = employees
		.stream()
		.filter(eachEmp -> { return "HYDERABAD".equalsIgnoreCase(eachEmp.getLocation());})
		.collect(Collectors.toList());
		
		List<Employee> puneEmpList = employees
		.stream()
		.filter(eachEmp -> { return "PUNE".equalsIgnoreCase(eachEmp.getLocation());})
		.collect(Collectors.toList());
		
		//printing hydEmpList directly calling forEach() on collection Object
		hydEmpList.forEach(emp -> System.out.println(emp.getEmpId() + " ====" + emp.getEmpName()+"===="+ emp.getLocation()));
		puneEmpList.forEach(emp -> System.out.println(emp.getEmpId() + " ====" + emp.getEmpName()+"===="+ emp.getLocation()));
		
		System.out.println("******************************************************");
		List<String> names = List.of("Suresh","Mahesh","Rajesh","Anil","Balu");
		
		//wanted to be names as comma seperated String i.e.,Suresh,Mahesh,Rajesh,Anil,Balu
		//String commaNamesValues = names.stream().collect(Collectors.joining(","));
		String commaNamesValues = names.stream().collect(Collectors.joining("||"));
		System.out.println(commaNamesValues);
	}
}