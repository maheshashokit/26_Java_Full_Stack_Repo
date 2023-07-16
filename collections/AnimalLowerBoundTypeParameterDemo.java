package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;

public class AnimalLowerBoundTypeParameterDemo {
	
	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<>();
		addAnimals(animalList);
		
		List<Object> objectAnimal = new ArrayList<>();
		addAnimals(objectAnimal);
		
		List<Dog> dogAnimal = new ArrayList<>();
		//addAnimals(dogAnimal); //because its sub class of Animal class
		
		List<Integer> nosList = new ArrayList<Integer>();
		nosList.add(13);
		nosList.add(23);
		nosList.add(33);
		printList(nosList);
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Mahesh");
		namesList.add("Suresh");
		namesList.add("Rajesh");
		printList(namesList);
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		printList(employees);
		
		//calling accept() with different parameters
		accept(12,13,14,12);
		accept("Mahesh","Suresh","Rajesh","Rahim");
		accept(emp1,emp2,emp3,emp4);
		accept(12.34f,123.34f,34.34f,23232.333f);
		
		//calling the accept()
		Integer returnedValue = accept(12,13,14);
		System.out.println(returnedValue);
		String returnedValue1 = accept("A","B","C");
		System.out.println(returnedValue1);
		
	}
	
	public static void addAnimals(List<? super Animal> animals) {
		//we can add the animal objects
		animals.add(new Cat());
		animals.add(new Dog());
	}
	
	//Can we write one generic method to display any type of data of List
	private static void printList(List<?> myList) {
		myList.forEach(eachElement -> System.out.println(eachElement));
	}
	
	//can we write one more generic method which accepts two generic parameters
	private static <T,V,R,Z> void accept(T firstParameter,V secondParameter,R thirdParameter,Z fourthParameter) {
		System.out.println("First Parameter:::::" + firstParameter);
		System.out.println("Second Parameter:::::" + secondParameter);
		System.out.println("Third Parameter::::::" + thirdParameter);
		System.out.println("Fourth Parameter::::::" + fourthParameter);
	}
	
	//can we write one more generic method which accepts two generic parameters
	private static <T,V,R> R accept(T firstParameter,V secondParameter, R thirdParameter) {
		System.out.println("First Parameter:::::" + firstParameter);
		System.out.println("Second Parameter:::::" + secondParameter);
		System.out.println("Third Parameter:::::" + thirdParameter);
		return thirdParameter;
		
		
	}
	

}
