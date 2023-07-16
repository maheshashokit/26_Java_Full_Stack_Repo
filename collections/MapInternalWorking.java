package com.ashokit.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInternalWorking {
	
	public static void main(String[] args) {
	
		//Creating the Map Object
		Map<String,String> users = new HashMap<>();
		
		//adding entries to map object
		users.put("Mahesh","Test@123"); //-1997777110
		users.put("Ashok","Test@321"); //63558011
		users.put("Naresh","12323Test"); //-1968779587
		users.put("Mahesh","Mahesh@123");
		users.put("Naresh","Naresh@123");
		users.put("FB","FB@123");
		users.put("Ea","Ea@123");
		users.put(null,"Test@1233");
		users.put(null,"Terst@4154");

		//printing the HashMap data
		System.out.println("Users:::::" + users);
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		System.out.println("Mahesh".hashCode());
		Object value = users.get("Mahesh454");
	    System.out.println(value);
		
	}
}