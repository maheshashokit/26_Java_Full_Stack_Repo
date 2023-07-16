package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArbitaryMethodReferences {

	public static void main(String[] args) {

		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");

		// Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();

		// adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);

		// extracting the employee names as List object
		List<String> empNames = employees.stream().map(eachEmp -> eachEmp.getEmpName()).collect(Collectors.toList());
		empNames.forEach(System.out::println);

		// extracting the employee names as List object
		List<String> empNames1 = employees.stream().map(Employee :: getEmpName).collect(Collectors.toList());
		empNames1.forEach(System.out::println);
		
		Map<Integer, String> employeeMap = employees.stream().collect(Collectors.toMap(eachEmp-> eachEmp.getEmpId(), eachEmp->eachEmp.getEmpName()));
		System.out.println(employeeMap);
		
		Map<Integer, String> employeeMap1 = employees.stream().collect(Collectors.toMap(Employee :: getEmpId, Employee::getEmpName));
		System.out.println(employeeMap1);
	}

}
