package com.ashokit.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		//creating the LinkedList Object
		LinkedList ll = new LinkedList();
		
		//adding the elements
		ll.add("Suresh");
		ll.addFirst("Ashok");
		ll.add(12);
		ll.addLast("Mahesh");
		//adding element at Middle
		ll.add(2, 25);	
		
		//printing Linked List Data
		System.out.println("LinkedList:::::" + ll);
		
		//Get method
		System.out.println("Get First Element::::" + ll.getFirst());
		System.out.println("Get Last Element::::" + ll.getLast());

		//calling peek()
		LinkedList ll1 = new LinkedList();
		Object peek = ll1.peek();
		System.out.println("Calling Peek Method::::" + peek);
		System.out.println("Calling Peek First Method::::" + ll.peekFirst());
		System.out.println("Calling Peek First Method::::" + ll1.peekFirst());
		System.out.println("Calling Peek Last Method ::::" + ll.peekLast());
		System.out.println("Calling Peek Last Method ::::" + ll1.peekLast());
		
		//calling pop()
		System.out.println("Calling poll()......." + ll.poll());
		System.out.println("Calling pollpoll()......." + ll);
		System.out.println("Calling poll()......." + ll.pollFirst());
		System.out.println("Linked list Data:::::" + ll);
		System.out.println("Callingpoll()........... " + ll.pollLast());
		System.out.println("Linked List Data:::::" + ll);
		
		//call list interface specific method
		System.out.println("Size Of Linked List::::"+ll.size());
		LinkedList clonedList = (LinkedList) ll.clone();
		System.out.println("Cloned Linked List:::::" + clonedList);
	}

}
