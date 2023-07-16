package com.ashokit.collections;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerateDemo {
	
	 public static void main(String[] args) {
		
		 //Defining the supplier for generating Random number
		 Supplier<Integer> randomSupplier = () -> {
			return new Random().nextInt(5000, 10000); 
		 };
		 
		 Supplier<String> welcomeSupplier = () -> {
			 return  "Welcome To AshokIT Hyderabad Ameerpet....";
		 };
		 
		 //Passing supplier to generate() and will return infinite values
		 //Stream<Integer> infiniteNumbers = Stream.generate(randomSupplier);//Infinite elements
		 Stream<Integer> infiniteNumbers = Stream.generate(randomSupplier).limit(15);//finite elements
		 Stream<String> welcomeFiniteMessages = Stream.generate(welcomeSupplier).limit(5);
		 
		 //Displaying infinite Values.
		 infiniteNumbers.forEach(eachNumber -> System.out.println(eachNumber));
		 welcomeFiniteMessages.forEach(eachMessage -> System.out.println(eachMessage));
		 
	}
}