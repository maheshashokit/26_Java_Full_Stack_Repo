package com.ashokit.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		
		// Create a Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Add elements to the table
		hashtable.put("apple", 10);
		hashtable.put("banana", 5);
		hashtable.put("cherry", 3);

		// Access an element
		int quantity = hashtable.get("banana");
		System.out.println("Quantity of bananas: " + quantity);

		// Modify an existing element
		hashtable.put("cherry", 4);

		// Remove an element
		hashtable.remove("apple");

		// Iterate over the table using Enumeration
		System.out.println("Iterating over keys:");
		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			int value = hashtable.get(key);
			System.out.println(key + ": " + value);
		}

		// Check if the table contains a key
		boolean containsKey = hashtable.containsKey("banana");
		System.out.println("Contains key 'banana'? " + containsKey);

		// Check if the table contains a value
		boolean containsValue = hashtable.containsValue(3);
		System.out.println("Contains value 3? " + containsValue);

		// Clear the table
		hashtable.clear();
		System.out.println("Hashtable after clearing: " + hashtable);
	}

}
