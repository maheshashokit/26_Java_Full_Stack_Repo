package com.ashokit.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> nosSet  = new TreeSet<>();
		
		//adding the elements to nosSet
		nosSet.add(150);
		nosSet.add(343);
		nosSet.add(4354);
		nosSet.add(532);
		nosSet.add(22);
		nosSet.add(3242);
		nosSet.add(343);
		System.out.println("Numbers is Ascending Order::::::" + nosSet);
		
		SortedSet<String> namesSet = new TreeSet<>();
		namesSet.add("Suresh");
		namesSet.add("Ramesh");
		namesSet.add("Nagesh");
		namesSet.add("Mahesh");
		namesSet.add("Naresh");
		namesSet.add("Ashok");
		namesSet.add("Ashok");
		namesSet.add("Ashok");
		namesSet.add("karthik");
		namesSet.add("karthik");
		namesSet.add("karthik");
		namesSet.add("Chanti");
		System.out.println("Names in Ascending Order::::::" + namesSet);
		
		Integer firstElement = nosSet.first();
		System.out.println("First Element:::::" + firstElement);
		
		Integer lastElement = nosSet.last();
		System.out.println("Last Element:::::" + lastElement);
		
		//Retrieves subset which is greater than and equal to given element
		SortedSet<Integer> tailSetElements = nosSet.tailSet(343);  
		SortedSet<String> tailSetString = namesSet.tailSet("Naresh");  
		System.out.println("TailSet Elements:::::" + tailSetElements);
		System.out.println("TailSet Elements:::::" + tailSetString);
		
		 //Retrives subset which is less than to given element
		SortedSet<Integer> headSetElements = nosSet.headSet(343);
		System.out.println("HeadSet Elements:::::" + headSetElements);
		SortedSet<String> tailSetString1 = namesSet.headSet("Naresh");  
		System.out.println("TailSet Elements:::::" + tailSetString1);
		
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		SortedSet<Employee> sortedEmpSet = new TreeSet<>();
		sortedEmpSet.add(emp1);
		sortedEmpSet.add(emp2);
		sortedEmpSet.add(emp3);
		sortedEmpSet.add(emp4);
		
		System.out.println(sortedEmpSet);
		
	}
}