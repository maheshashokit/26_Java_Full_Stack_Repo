package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//creating the ArrayList Object
		//Before Java8 It will print as 10 because Default Size
		//From Java8 there is no default size
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList(45);
		System.out.println("Initial ArrayList Size::::" + al.size());
		System.out.println("Initial ArrayList Size::::" + al1.size());
		al.add("Mahesh");
		al.add("Mahesh");
		al.add(12);
		al.add(12);
		al.add(12.365f);
		al.add(12.3698d);
		al.add(12.3698d);
		al.add(true);
		al.add(true);
		al.add('c');		
		System.out.println("Initial ArrayList Size::::" + al.size());
		System.out.println("Data From ArrayList:::::::" + al);
		
		//wanted to add the element at particular index
		al.add(5,"Suresh");
		System.out.println("After Adding element at index::::" + al);
		
		//updating the value based on index
		al.set(5, "Suresh Kumar");
		System.out.println("After Updating Element at Index:::::" + al);
		
		//removing the element based on index
		al.remove(1);
		System.out.println("After Removing element at Index::::"+ al);
		
		//removing the element based supplied element
		List removeElements = new ArrayList<>();
		removeElements.add(true);
		al.removeAll(removeElements);
		System.out.println("After Removing Element:::::" + al);
		
		//getting element based on index
		System.out.println("Fifth Element Value:::"+al.get(5));
		
		//getting index of element
		System.out.println("Index of Element::::" + al.indexOf(12.3698)); 
		System.out.println("Last Index of Element::::" + al.lastIndexOf(12.3698)); 
		System.out.println("ArrayList Data:::::" + al);
		
	    //sublist //We are getting elements from 2 to 5
		List subList = al.subList(2, 6);
		System.out.println("From 2 TO 5 Elements:::::" + subList);
		
		//cloning 
		ArrayList clonedList = (ArrayList) al.clone();
		System.out.println("Duplicate List:::::" + clonedList);
		clonedList.add("Test");
		System.out.println("After Adding Cloned List::::" + clonedList);
		System.out.println("Original List:::::" + al);
		
		//removing the elements from list to original List
		boolean status = al.removeAll(clonedList);
		System.out.println("Statust::::" + status);
		System.out.println("Original List::::" + al);
		System.out.println("Cloned  List::::" + clonedList);
		
		System.out.println("Checking Empty or not::::" + al.isEmpty());
		System.out.println("Checking Empty or not::::" + clonedList.isEmpty());
		
		//making the collection as readonly
		System.out.println("ArrayList Data ::::" + clonedList);
		List unmodifedList = Collections.unmodifiableList(clonedList);
		System.out.println("UnmodifiedList::::" + unmodifedList);
		unmodifedList.add("Naresh"); //UnsupportedOperationException
		System.out.println("Final Cloned List:::::" + clonedList);
	}
}
