package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapDemo {
	
	public static void main(String[] args) {
		
		List<String> numbers = List.of("100","200","300","400","500");
		
		List<Integer> finalNumbers = new ArrayList<>();
		//1.Traditional Approach
		Iterator<String> numberIterator = numbers.iterator();
		while(numberIterator.hasNext()) {
			String currentNumber = numberIterator.next();
			Integer currentValue  = Integer.valueOf(currentNumber);
			System.out.println("Current Value::::" + currentValue);
			//adding the Integer value for finalNumbers List
			finalNumbers.add(currentValue);
		}
		System.out.println("Final Numbers::::::" + finalNumbers);
		System.out.println("*****************************************************");
		
		 //2.Stream Approach using step by step process
		 Stream<String> stringNumbers = numbers.stream();
		 
		 Function<String,Integer> functionObj = (eachNumberAsString) -> {
			 return Integer.valueOf(eachNumberAsString);
		 };
		 Consumer<Integer> integerConsumer = eachNumber -> {
			 System.out.println("Each Number::::" +eachNumber);
			 //Again I am adding eachnumber to finalNumbers
			 finalNumbers.add(eachNumber);
		 };
		 //converting the String to Integer
		 Stream<Integer> numberIntegers = stringNumbers.map(functionObj);
		 
		 //displaying the Integers
		 numberIntegers.forEach(integerConsumer);
		 
		 System.out.println("Final Numbers::::::"+ finalNumbers);
		 
		 System.out.println("****************************************************");
		 //3. Stream Approach using with Single line approach
		 numbers.stream()
		 .map(eachNumberAsString -> {
			 return Integer.valueOf(eachNumberAsString);
		 })
		 .forEach(eachNumber -> {
			 System.out.println("Each Number::::" +eachNumber);
			 //Again I am adding eachnumber to finalNumbers
			 finalNumbers.add(eachNumber);
		 });
		 System.out.println("Final Numbers::::::"+ finalNumbers);
	}
}