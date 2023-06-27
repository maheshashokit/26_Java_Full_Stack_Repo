package com.ashokit.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessingWithForEachDemo {
	
	public static void main(String[] args) {
		
		//Type Safe Collection
		LinkedList<String> namesList = new LinkedList<>();
		namesList.add("Mahesh");
		namesList.add("Ashok");
		namesList.add("Karthik");
		
		//processing the TypeSafe Collection using EnhancedForLoop
		int index = 1;
		for(String currentItem : namesList) {
			System.out.println(index +"." +currentItem);
			index++;
		}
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh");
		Employee emp2 = new Employee(354,"Suresh");
		Employee emp3 = new Employee(454,"Rajesh");
		Employee emp4 = new Employee(554,"Ramesh");
		Employee emp5 = new Employee(654,"Mahesh");
		
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		//Enhanced For Loop
		for(Employee currentEmp : employees) {
			if("mahesh".equalsIgnoreCase(currentEmp.getEmpName())) {
				System.out.println(currentEmp.getEmpId() +"======"+ currentEmp.getEmpName());
			}
		}
	}
}