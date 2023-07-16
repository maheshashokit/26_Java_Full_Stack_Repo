package com.ashokit.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorReference {

	public static void main(String[] args) {

		Function<Integer, MyClass> constructorRef = MyClass::new;

		// calling apply() of Function interface
		MyClass obj = constructorRef.apply(42); // passing to parameter constructor of MyClass
		System.out.println("A value ::::" + obj.getA());

		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");
		Employee emp5 = new Employee(123, "MaheshKumar", "Pune");

		// Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();

		// adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		//converting employees into map
		LinkedHashMap<Integer, String> employeeMap = 
		employees.stream().collect(
		Collectors.toMap(Employee :: getEmpId, Employee :: getEmpName,(oldValue,newValue) -> oldValue ,LinkedHashMap::new));
	    System.out.println(employeeMap);
	}
}