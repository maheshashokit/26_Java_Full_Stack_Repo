package com.ashokit.collections;

import java.util.Arrays;
import java.util.function.Predicate;

public class StaticMethodReferencesDemo {
	
	public static void main(String[] args) {
		
		//Writing the Implementation using LambdaExpression
		Predicate<String> nameCheck = name -> {return name.length() > 0;};
		
		//calling test()
		System.out.println("Test::: " + nameCheck.test("Mahesh"));
		
		System.out.println("***********************************************************");
	    
		//Writing the Implementation using static Method References
		Predicate<String> nameCheck1 = StaticMethodReferences :: nameLengthChecking;
		
		//calling test()
		System.out.println("Testing:::::" + nameCheck1.test(null));
		System.out.println("**********************************************************");
		//Stream operations
		String[]  names = {"Mahesh","Suresh","Ramesh","Ashok"};
		
		Arrays.stream(names).map(eachName -> {return eachName.toUpperCase();})
							.forEach(eachName -> System.out.println(eachName));
		System.out.println("******************************************************");
	
		Arrays.stream(names).map(StaticMethodReferences :: nameConversion).forEach(eachName -> System.out.println(eachName));
		
	}
}