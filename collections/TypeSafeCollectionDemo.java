package com.ashokit.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeSafeCollectionDemo {
	
	public static void main(String[] args) {
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh");
		Employee emp2 = new Employee(354,"Suresh");
		Employee emp3 = new Employee(454,"Rajesh");
		Employee emp4 = new Employee(554,"Ramesh");
		
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		//printing the Employees Object
		System.out.println(employees);
		
		//TypeSafe Collection
		LinkedList<String> namesList = new LinkedList<>();
		namesList.add("Mahesh");
		namesList.add("Ashok");
		namesList.add("Karthik");
		System.out.println(namesList);
	}
}