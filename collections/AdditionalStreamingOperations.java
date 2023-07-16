package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdditionalStreamingOperations {

	public static void main(String[] args) {

		// preparing some Sample Data of Employee objects
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
		
		//Preparing Some Sample Data of Strings
		List<String> names = 
		Arrays.asList("Mahesh","Suresh","Rajesh","Nagesh","Mahesh","Nagesh");
		
		//Write aJava8 Code for Converting names from lower case into upper case
		List<String> upperCaseNames = names.stream()
		.map(currentName -> currentName.toUpperCase())
		.collect(Collectors.toList());
		System.out.println("Upper Case Names:::::" + upperCaseNames);
	
		System.out.println("**********************************************");
		
		Set<String> distinctNames = names.stream()
		.map(currentName -> currentName.toUpperCase())
		.collect(Collectors.toSet());
		System.out.println("Distinct Names:::::" + distinctNames);
		
		System.out.println("*********************************************");
		//Write Java8 Code to extract employee names as comma seperated values from employees list 
		//OUTPUT ::: Mahesh,Suresh,Rajesh,Ramesh
		String commaSepartedNames = employees.stream()
		.map(eachEmp -> eachEmp.getEmpName())
		.collect(Collectors.joining(","));
		System.out.println("CommaSeperatedNames::::" + commaSepartedNames);
		
		//Write Java8 Code to convert the List<String> into Map object where key
		//should be string and value should be length of string.
		//Map<String,Integer>
		Map<String,Integer> namesMap = distinctNames.stream()
	    .collect(Collectors.toMap(eachName -> eachName, eachName -> eachName.length()));
		System.out.println(namesMap);
		Map<String,Integer> namesMap1 = distinctNames.stream()
	    .collect(Collectors.toMap(Function.identity(), eachName -> eachName.length()));
		System.out.println(namesMap1);
		
		//Write Java8 code to convert the List<Employee> into map object
		//where key should be employeeId and value should be employeeName
		Map<Integer,String> employeeMap = employees.stream()
		.collect(Collectors.toMap(eachEmp -> eachEmp.getEmpId(), eachEmp -> eachEmp.getEmpName()));
		System.out.println(employeeMap);
		
		//Write Java8 Code to convert the List<Employee> into Map object
		//where key should be employeeId and value should be employee object
		Map<Integer, Employee> employeesMap = employees.stream()
		.collect(Collectors.toMap(eachEmp -> eachEmp.getEmpId(), eachEmp -> eachEmp));
		System.out.println(employeesMap);
		
		Map<Integer, Employee> employeesMap1 = employees.stream()
		.collect(Collectors.toMap(eachEmp -> eachEmp.getEmpId(), Function.identity()));
		System.out.println(employeesMap1);
		
		//Can you process the Map Object using java8 Streams concept
		//How to process the Map Object using entrySet(), keySet()
		employeesMap1.entrySet().stream().forEach(eachEntry ->{
			System.out.println(eachEntry.getKey() + "====" + eachEntry.getValue());
		});
		
		//Converting the Map of Employees information into List<Employee>
		List<Employee> employeesList = employeeMap.entrySet().stream()
		.map(eachEntry -> new Employee(eachEntry.getKey(), eachEntry.getValue()))
		.collect(Collectors.toList());
		System.out.println(employeesList);
		
		//Converting the Map of Employees information into Employee[]
		Employee[] emps = employeeMap.entrySet().stream()
		.map(eachEntry -> new Employee(eachEntry.getKey(), eachEntry.getValue()))
		.toArray(Employee[] :: new);
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		
		List<String> nosListt = Arrays.asList("1","2","3","4","5");
		List<Integer> finalNosList = nosListt.stream().map(eachNumber -> Integer.parseInt(eachNumber)).collect(Collectors.toList());
		System.out.println(finalNosList);
	}
}