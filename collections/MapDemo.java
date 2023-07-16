package com.ashokit.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
	
		HashMap<String,String> users = new HashMap<>();
		
		users.put("Mahesh", "Test@123");
		users.put("Ashok",  "Test@124");
		users.put("Naresh", "Test@123");
		users.put("Mahesh", "Test@321");
		System.out.println("Users:::::::" + users);
		
		//Getting the same hashcode for two strings
		System.out.println("First HashCode:::" + "FB".hashCode());
		System.out.println("Second HashCode::::" + "Ea".hashCode());
		
		Map<String,String> info = new HashMap<>();
		info.put("FB","fb");
        info.put("Ea","ea");
        System.out.println("Info::::" + info);
		
		String st1 ="Mahesh";
		String st2 ="Mahesh";
		System.out.println("st1 hashcode::::" + st1.hashCode());
		System.out.println("st2 hashcode::::" + st2.hashCode());
		System.out.println("Equals:::::" + st1.equals(st2)); //content comparsion
		System.out.println("Compare:::::" + (st1 == st2));//hashcode comparsion
	}
}
