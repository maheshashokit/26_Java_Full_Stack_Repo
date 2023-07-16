package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComparatorSortingDemo {

	public static void main(String[] args) {

		// Sample Data
		List<Employee1> employees = new ArrayList<Employee1>();

		// adding employee objects into List
		employees.add(new Employee1(123,"Mahesh","Hyderabad"));
		employees.add(new Employee1(65,"Mahesh","Hyderabad"));
		employees.add(new Employee1(354,"Suresh","Bangalore"));
		employees.add(new Employee1(454,"Rajesh","Pune"));
		employees.add(new Employee1(554,"Ramesh","Hyderabad"));
		employees.add(new Employee1(698,"Babu","Hyderabad"));
		
		//sorting
		//Collections.sort(employees,new EmployeeIdComparator());
		//System.out.println("After Sorting:::" + employees);
		//sorting the employees object using EmployeeName
		//Collections.sort(employees,new EmployeeNameComparator());
		//System.out.println("After Sorting::::" + employees);
		//Collections.sort(employees,new EmployeeIdNameComparator());
		//System.out.println("After Sorting"+ employees);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//sorting the employees object using java8 comparator
		Comparator<Employee1> empIdComparator = (o1, o2) -> o1.getEmpId().compareTo(o2.getEmpId());
		Comparator<Employee1> empNameComparator = (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName());
		Comparator<Employee1> genderComparator = (o1, o2) -> o1.getGender().compareTo(o2.getGender());
		List<Employee1> sortedEmpList = 
		//employees.stream().sorted(new EmployeeIdComparator()).collect(Collectors.toList());
		employees.stream()
		.sorted(empNameComparator.thenComparing(empIdComparator).thenComparing(genderComparator))
		.collect(Collectors.toList());
		System.out.println("After Sorting::::" + sortedEmpList);
		
		//filter(),map(),sorted(),generate(),limit()
		//foEach(),collect()
		//Debug Coding F6 >>> Line by Line Execution, 
		//             F5 >>> Internals about current line
		//			   F8 >>> execution termination
	}

}
