package com.ashokit.collections;

import java.util.HashMap;
import java.util.HashSet;

public class SetInternalDemo {
	
	public static void main(String[] args) {
		
		User user1 = new User("Mahesh","Test@123");
		User user2 = new User("Mahesh","Test@123");
		
		HashSet<User> userSet = new HashSet<>();
		userSet.add(user1);
		userSet.add(user2);
		
		HashSet<String> names = new HashSet<String>();
		names.add("Mahesh");
		names.add("Mahesh");
		
		System.out.println("UserSet::::" + userSet);
		System.out.println("UserSet Size::::" + userSet.size());
		
	}

}
