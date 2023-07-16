package com.ashokit.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentityExample {

	public static void main(String[] args) {

		// Defining the String[]
		String[] names = { "Mahesh", "Suresh", "Nagesh", "Rajesh", "Naresh" };
		String[] duplicateNames = { "Mahesh", "Suresh", "Nagesh", "Rajesh", "Naresh", "Mahesh", "Rajesh" };
		
		//current item input of collect() represent as key & value of Map object
		Map<String, String> usersMap = Arrays.stream(names).collect(Collectors.toMap(Function.identity(), Function.identity()));
		
		System.out.println(usersMap);
	
	}
}

