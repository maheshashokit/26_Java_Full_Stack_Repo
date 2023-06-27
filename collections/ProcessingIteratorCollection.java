package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ProcessingIteratorCollection {
	
	public static void main(String[] args) {
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh");
		Employee emp2 = new Employee(354,"Suresh");
		Employee emp3 = new Employee(454,"Rajesh");
		Employee emp4 = new Employee(554,"Ramesh");
		
		 //creating 10 Employees objects
		 List<Employee> bulkEmployees = new ArrayList<>();
		 for(int i = 1; i<=10;i++) {
			 bulkEmployees.add(new Employee(i,"ASHOKIT"+i));
		 }
		 System.out.println(bulkEmployees);
		 System.out.println("Size of Bulk Employees:::::" + bulkEmployees.size());
		 
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(null);
		
		//Getting the Iterator Object using iterator() on employees object
		Iterator<Employee> empIterator = employees.iterator();
		
		//Taking another List for Holding employee information starts with R.
		List<Employee> employeeList = new ArrayList<>();
		
		//checking empIterator having element
		while(empIterator.hasNext()) {
			
			//Getting the Current Element
			Employee currentEmp = empIterator.next();
			
			//Displaying the Current Employee Information
			if(currentEmp != null && (currentEmp.getEmpName().startsWith("R") || currentEmp.getEmpName().startsWith("r"))) {
				System.out.println(currentEmp.getEmpId() + " ======" + currentEmp.getEmpName());
				//Adding employee objects starts with R
				employeeList.add(currentEmp);
			}
		}		
		System.out.println("Employee Objects start with R::::" + employeeList);
		System.out.println("Employee Objects start with R Size::::" + employeeList.size());
	}
}