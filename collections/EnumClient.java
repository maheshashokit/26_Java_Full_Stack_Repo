package com.ashokit.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ashokit.collections.User.UserStatus;

public class EnumClient {
	
	public static void main(String[] args) {
		
		Status customerStatus = Status.ACTIVE;
		if(customerStatus == Status.ACTIVE) {
			System.out.println("Its active Customers");
		}
		
		Integer activeValue = customerStatus.getValue();
		System.out.println("Active value::::" + activeValue);
		
		User user1 = new User("Mahesh","Mahesh",Status.ACTIVE);
		User user2 = new User("Ashok","Ashok",Status.ACTIVE);
		User user3 = new User("Suresh","Suresh",Status.INACTIVE);
		User user4 = new User("Rajesh","Rajesh",Status.INACTIVE);
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println(user3.hashCode());
		System.out.println(user4.hashCode());
		
		//Runtime rt = new Runtime();
		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime();
		Runtime rt3 = Runtime.getRuntime();
		System.out.println(rt1.hashCode());
		System.out.println(rt2.hashCode());
		System.out.println(rt3.hashCode());
		
		
		
		List<User> allUsers = Arrays.asList(user1,user2,user3,user4);
		System.out.println(allUsers);
		
		List<User> activeUsers = allUsers.stream().filter(user -> Status.ACTIVE.equals(user.getStatus()))
		                                          .collect(Collectors.toList());
		activeUsers.forEach(System.out::println);
	
		UserStatus us = UserStatus.ACTIVE;
	}

}
