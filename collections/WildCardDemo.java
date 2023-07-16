package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
	
	public static void addNumbers(List<? super Integer> numbers) {
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		addNumbers(numberList);
		System.out.println("NumberList::::" + numberList);
		
		List<Object> objectNumberList = new ArrayList<>();
		addNumbers(objectNumberList);
		System.out.println("Object Number List:::::" + objectNumberList);
		
		List<Number> doubleNumberList = new ArrayList<>();
		addNumbers(doubleNumberList);
		
		
		
	}

}
