package com.ashokit.collections;

import java.util.HashMap;
import java.util.Map;

public class UserMapClient {
	
	public static void main(String[] args) {
		
		//Created the Two string literals
		String s1 = "Ashok";
		String s2 = "Ashok";
		
		//Debugging statement
		System.out.println("S1 hashcode:::::" + s1.hashCode());
		System.out.println("S2 hashcode:::::" + s2.hashCode());
		System.out.println("Equals()......" + s1.equals(s2));//content comparsion
		System.out.println("Comparsion...." + (s1 == s2));//hashcode comparsion
		
		System.out.println("***************1.Scenario*****************************");
		
		User user1 = new User("Mahesh","Test@123");
		User user2 = new User("Ashok","Test@123");
		User user3 = user1;
		User user4 = new User("Mahesh","Test@123");
		
		System.out.println("First Scenario");
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println("Object equality:::::" + user1.equals(user2));//false
		System.out.println("Object Comparsion:::" + (user1.hashCode() == user2.hashCode()));//false
		
		System.out.println("*********************2.Scenario************************");
		System.out.println("User-1::::" +user1.hashCode());
		System.out.println("User-2::::" +user2.hashCode());
		System.out.println("User-3::::" +user3.hashCode());
		System.out.println("Object Equality:::::" + user1.equals(user3)); //true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user3.hashCode()));//true
		
		System.out.println("*********************3.Scenario ************************");
		System.out.println("User-1::::" +user1.hashCode());
		System.out.println("User-2::::" +user2.hashCode());
		System.out.println("User-3::::" +user3.hashCode());
		System.out.println("User-4::::" +user4.hashCode());
		System.out.println("Object Equality:::::" + user1.equals(user3)); //true
		System.out.println("Object Equality:::::" + user1.equals(user4)); //false
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user3.hashCode()));//true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user4.hashCode()));//false
		
		System.out.println("***********************************************");
		Map<User,String> userMap = new HashMap<>();
		userMap.put(user1, user1.getUsername());
		userMap.put(user2, user2.getUsername());
		userMap.put(user3, user3.getUsername()+"Test");
		userMap.put(user4, user4.getUsername()+"LastModifed");
		System.out.println(userMap);
		
		
		System.out.println("*********************After Overriding equals() ************************");
		System.out.println("User-1::::" +user1.hashCode());
		System.out.println("User-2::::" +user2.hashCode());
		System.out.println("User-3::::" +user3.hashCode());
		System.out.println("User-4::::" +user4.hashCode());
		System.out.println("Object Equality:::::" + user1.equals(user3)); //true
		System.out.println("Object Equality:::::" + user1.equals(user4)); //true
		System.out.println("Object Equality:::::" + user3.equals(user4)); //true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user3.hashCode()));//true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user4.hashCode()));//false
		
		
		System.out.println("*********************After Overriding equals() & hashcode ************************");
		System.out.println("User-1::::" +user1.hashCode());
		System.out.println("User-2::::" +user2.hashCode());
		System.out.println("User-3::::" +user3.hashCode());
		System.out.println("User-4::::" +user4.hashCode());
		System.out.println("Object Equality:::::" + user1.equals(user3)); //true
		System.out.println("Object Equality:::::" + user1.equals(user4)); //true
		System.out.println("Object Equality:::::" + user3.equals(user4)); //true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user3.hashCode()));//true
		System.out.println("Object Comparsion::::" + (user1.hashCode() == user4.hashCode()));//false
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("Z".compareTo("Z"));
		
	}
}