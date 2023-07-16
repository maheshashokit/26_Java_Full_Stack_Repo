package com.ashokit.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArraysExample {
	public static void main(String[] args) {
		// Sorting an array
		int[] numbers = { 5, 2, 8, 1, 9 };
		Arrays.sort(numbers);
		System.out.println("Sorted array: " + Arrays.toString(numbers));
		
		Integer[] nos1 = {1,2,3,685,842};
		Arrays.sort(nos1, Collections.reverseOrder());
		System.out.println(Arrays.toString(nos1));

		// Searching an element in a sorted array
		int key = 8;
		int index = Arrays.binarySearch(numbers, key);
		System.out.println("Index of " + key + " in the sorted array: " + index);

		// Converting an array to a String
		String[] fruits = { "Apple", "Banana", "Orange" };
		Integer[] nos = {10,20,30,40,50};
		System.out.println("Array: " + Arrays.toString(fruits));
		System.out.println("Array: " + Arrays.toString(nos));

		// Convert the array to a fixed-size list
		List fruitList = Arrays.asList(fruits);
		System.out.println("List: " + fruitList);//["Apple", "Banana", "Orange" ]

		// Convert the array to stream object
		Stream<String> fruitsStream = Arrays.stream(fruits);
		fruitsStream.forEach(eachFruit -> System.out.println(eachFruit));

		// Checking equality of arrays
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("Arrays arr1 and arr2 are equal: " + isEqual);

		// Copying a range of elements from one array to another
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = Arrays.copyOfRange(sourceArray, 1, 4); // 2, 3, 4
		
		System.out.println("Copied array: " + Arrays.toString(destinationArray));
	}

}
