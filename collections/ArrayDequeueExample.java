package com.ashokit.collections;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
	
	public static void main(String[] args) {
		
		 // Create an instance of ArrayDeque
        ArrayDeque deque = new ArrayDeque();

        // Add elements to the deque
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");
        
        System.out.println("Array Dequeue Data::::" + deque);
        deque.add("waterMelon");
        System.out.println("Array Dequeue Data::::" + deque);
        
        // Add elements at the beginning and end of the deque
        deque.addFirst("Mango");
        deque.addLast("Grapes");
        System.out.println("Array Dequeue Data::::" + deque);
        
        // Get and remove the first element
        String firstElement = (String)deque.pollFirst();
        System.out.println("Removed first element: " + firstElement);

        // Get and remove the last element
        String lastElement = (String)deque.pollLast();
        System.out.println("Removed last element: " + lastElement);
        System.out.println("After Removing Data ::::" + deque);
        
        String pollResult = (String)deque.poll();
        System.out.println("PollResult :::::" + pollResult);
        System.out.println("After Poll Method:::::" + deque);
        deque.add("Testing");
        System.out.println("Dequeue Data::::" + deque);
        deque.poll();
        System.out.println("Dequque Data:::::" + deque);
	}
}