package com.ashokit.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		//creating the Queue Object
		Queue queue = new LinkedList();

        // Adding elements to the queue
        queue.add("Apple");
        queue.offer("Banana");
        queue.add("Cherry");
        System.out.println("Elements From queue::::" + queue);
        
        // Removing elements from the queue
        String element = (String)queue.remove(); // Removes and returns "Apple"
        System.out.println("Removed element ::::" + element);
        System.out.println("Queue Information:::::" + queue);
        
        String polledElement = (String)queue.poll(); // Removes and returns "Banana"
        System.out.println("Poll ELement:::::" + polledElement);
        System.out.println("Queue Information:::::" + queue);
        
        // Retrieving the element at the front of the queue
        queue.offer("Orange");
        System.out.println("Queue:::::" + queue);
        String frontElement =(String) queue.element(); // Returns "Cherry"
        String peekedElement = (String)queue.peek(); // Returns "Cherry"
        System.out.println(frontElement + " ====== "+ peekedElement);
	}
}
