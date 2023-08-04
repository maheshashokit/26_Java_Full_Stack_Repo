package com.ashokit.singleton;

public class EarlyIntializationClient {
	
	public static void main(String[] args) {
		
		EarlyIntialization object1 = EarlyIntialization.getInstance();
		System.out.println(object1.hashCode());
		
		EarlyIntialization object2 = EarlyIntialization.getInstance();
		System.out.println(object2.hashCode());
		
		EarlyIntialization object3 = EarlyIntialization.getInstance();
		System.out.println(object3.hashCode());
		
		EarlyIntialization object4 = EarlyIntialization.getInstance();
		System.out.println(object4.hashCode());
		
	}
}
