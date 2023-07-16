package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
	
	public static void main(String[] args) {

		//Create Employee Objects
	   Employee emp1 = new Employee(35,"Mahesh","Hyderabad");
	   Employee emp2 = new Employee(25,"Suresh","Bangalore");
	   Employee emp3 = new Employee(15,"Rajesh","Pune");
	   Employee emp4 = new Employee(06,"Ramesh","Hyderabad");
	   Employee emp5 = new Employee(110,"Arun","Pune");
	   Employee emp6 = new Employee(112,"Arun","Hyderabad");
	 
	   //Sample Data Strings Sorting
	   List<String> names = new ArrayList<>();
	   names.add("Suresh");
	   names.add("Ramesh");
	   names.add("Rajesh");
	   names.add("Anil");
	   names.add("arun");
	   names.add("babu");
	   names.add("2123Sample");
	   names.add("123Test");

	   //Sample Data for Numbers Sorting
	   List<Integer> numbers = new ArrayList<>();
	   numbers.add(150);
	   numbers.add(250);
	   numbers.add(124);
	   
	   //Sorting employee objects
	   List<Employee> employees = new ArrayList<>();
	   employees.add(emp1);
	   employees.add(emp2);
	   employees.add(emp3);
	   employees.add(emp4);
	   employees.add(emp5);
	   employees.add(emp6);
	   
	   //Sorting names objects
	   System.out.println("Before Sorting:::::::" + names);
	   Collections.sort(names);
	   System.out.println("After Sorting :::::::" + names);
	   
	   //sorting number objects
	   System.out.println("Before Sorting:::::::" + numbers);
	   Collections.sort(numbers);
	   System.out.println("After Sorting :::::::" + numbers);
	  
	   System.out.println("Before Sorting Employees:::::::"+ employees);
		  
	   System.out.println();
	   System.out.println("************Comparable Objects*********************");
	   Collections.sort(employees); //sort the employee objects based on empId
	   System.out.println("After Sorting::::::::" + employees);
	   System.out.println("***************************************************");
	   
	   System.out.println();
	   System.out.println("************Comparator Objects*********************");
	  // Collections.sort(employees,new EmployeeIdNameComparator()); //sort the employee objects based on employeeName 
	   System.out.println("After Sorting::::::::" + employees);
	   System.out.println("***************************************************");
	}
}