package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {

		// sample data
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(258);
		numbers.add(789);
		numbers.add(214);
		numbers.add(698);
		numbers.add(736);
		System.out.println("Before Sorting::::" + numbers);

		// sample data
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Nagesh");
		names.add("Ramesh");
		names.add("Rajesh");
		System.out.println("Before Sorting:::::" + names);

		// Sample Data
		List<Employee> employees = new ArrayList<Employee>();

		// adding employee objects into List
		employees.add(new Employee(123, "Mahesh", "Hyderabad"));
		employees.add(new Employee(354, "Suresh", "Bangalore"));
		employees.add(new Employee(454, "Rajesh", "Pune"));
		employees.add(new Employee(232, "Sunitha", "Agra"));
		employees.add(new Employee(554, "Ramesh", "Hyderabad"));
		System.out.println("Before Sorting employees::::" + employees);
		
		System.out.println("***************Ascending Order****************");
		Collections.sort(numbers);//numbers in ascending order
		System.out.println("Ordered Numbers :::::" + numbers);
		Collections.sort(names); //names in alphabetical order
		System.out.println("Ordered Names::::::" + names);
		Collections.sort(employees);
		System.out.println("Oredered Employees:::::"+ employees);
		
		System.out.println("************ Decending Order*************");
		Collections.sort(numbers,Collections.reverseOrder());//numbers in descending order
		System.out.println("Ordered Numbers :::::" + numbers);
		Collections.sort(names,Collections.reverseOrder()); //names in alphabetical order
		System.out.println("Ordered Names::::::" + names);
		Collections.sort(employees,Collections.reverseOrder()); //names in alphabetical order
		System.out.println("Ordered Employees Descending::::::" + employees);
		
		System.out.println("***********Java8 Streams Sorting Ascending Order********");
		numbers.stream().sorted().forEach(eachElement -> System.out.print(eachElement+ " "));
		System.out.println();
		names.stream().sorted().forEach(eachElement -> System.out.print(eachElement+ " "));
		System.out.println();
		employees.stream().sorted().forEach(eachElement -> System.out.print(eachElement+ " "));
		System.out.println();
		System.out.println("***********Java8 Streams Sorting Descending Order********");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(eachElement -> System.out.print(eachElement+ " "));
		System.out.println();
		names.stream().sorted(Comparator.reverseOrder()).forEach(eachElement -> System.out.print(eachElement+ " "));
		System.out.println();
		employees.stream().sorted(Comparator.reverseOrder()).forEach(eachElement -> System.out.print(eachElement+ " "));
		
	}
}
