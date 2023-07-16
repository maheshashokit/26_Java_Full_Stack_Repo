package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSortDemo  {
	
	public static void main(String[] args) {

		//sample data
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(258);
		numbers.add(789);
		numbers.add(214);
		numbers.add(698);
		numbers.add(736);
		System.out.println("Before Sorting::::" + numbers);
		
		//sample data
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Nagesh");
		names.add("Ramesh");
		names.add("Rajesh");
		System.out.println("Before Sorting:::::" + names);
		
		//Sample Data
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(new Employee(123,"Mahesh","Hyderabad"));
		employees.add(new Employee(354,"Suresh","Bangalore"));
		employees.add(new Employee(454,"Rajesh","Pune"));
		employees.add(new Employee(554,"Ramesh","Hyderabad"));

		System.out.println("*************************************************");
		//Sorting elements of collection using traditional approach
		Collections.sort(numbers);
		System.out.println("After Sorting Numbers In Ascending:::::" + numbers);
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println("After Sorting Numbers In Descending:::::" + numbers);
		Collections.sort(names);
		System.out.println("After Sorting Names in Alphabetical::::::" + names);
		Collections.sort(names,Collections.reverseOrder());
		System.out.println("After Sorting Names in Alphabetical::::::" + names);
		
		System.out.println("***************************************************");
		
		//sorting elements of collection using Java8 Streams
		System.out.println("Sorting the numbers using Java8 in Ascending order");
		numbers.stream().sorted().forEach(eachElement -> System.out.print(eachElement +" "));
		System.out.println();
		System.out.println("Sorting the numbers using Java8 in Descending order");
		numbers.stream().sorted(Collections.reverseOrder()).forEach(eachElement -> System.out.print(eachElement +" "));
		
		//sorting elements of collection using Java8 Streams
		System.out.println();
		System.out.println("Sorting the names using Java8 in Ascending order");
		names.stream().sorted().forEach(eachElement -> System.out.print(eachElement +" "));
		System.out.println();
		System.out.println("Sorting the names using Java8 in Descending order");
		names.stream().sorted(Collections.reverseOrder()).forEach(eachElement -> System.out.print(eachElement +" "));
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("Before Sorting Employee::::" + employees);
		Collections.sort(employees);
		System.out.println("After Sorting Employee:::::" + employees);
		employees.stream().sorted(Collections.reverseOrder()).forEach(
		 eachEmp -> {
			 System.out.println(eachEmp);
		 }		
		);	
		/*System.out.println("A".compareTo("Z"));//-ve
		System.out.println("Z".compareTo("A"));//+ve
		System.out.println("A".compareTo("A"));//0*/
		System.out.println();
	}
}
