package com.ashokit.collections;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();

		// Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack Data:::::" + stack);
        
       // Popping elements from the stack
        String element = (String)stack.pop(); // Removes "Cherry" from the stack
        System.out.println("Removed Element::::" + element);
        System.out.println("Stack Data :::::" + stack);
        
        // Peeking the top element
        String topElement = (String)stack.peek(); // Returns "Banana" without removing it
        System.out.println("Retreiving Top Most Element of Stack ::::" + topElement);
        
        // Checking if the stack is empty
        boolean isEmpty = stack.empty(); // Returns false
        System.out.println("Checking Stack Elements::::" + isEmpty);
        
        // Searching for an element
        int position = stack.search("Apple"); // Returns 2 (1-based index)
        System.out.println("Search Element Position::::" + position);
        
        // Printing the stack
        System.out.println(stack); // Outputs: [Apple, Banana]
        
        //call List specific methods
        Stack clonedStack = (Stack)stack.clone();
        System.out.println("Cloned Stack ::::" + clonedStack);
        
        //clearing elements from Stack
        stack.clear();
        
        System.out.println("Stack Data:::::" + stack);
        System.out.println("Checking Stack Elements:::::" + stack.isEmpty());
        
        stack.addAll(clonedStack);
        System.out.println("Adding ELements to main stack from Cloned stack:::::"+ stack);
        System.out.println("clonedStack=" + clonedStack);
        Stack st = new Stack();
        st.addAll(0,stack);//will check on addAll()
        System.out.println("st=" + st);
		
	}

}
