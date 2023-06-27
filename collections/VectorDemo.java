package com.ashokit.collections;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Default Vector Capacity:::::" + v.capacity());
		
		for(int i =1; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println("Vector size:::::" + v.size());
		System.out.println("Vector :::::" + v);
		
		//particular Element
		System.out.println("Particular ELement:::" + v.elementAt(5));
		
		//updating the element
		v.setElementAt("Mahesh",5);
		System.out.println("After Adding::::" + v);
		
		//cloning the vector
		Vector clonedVector = (Vector)v.clone();
		System.out.println("Cloned Vector:::::" + clonedVector);
		
		v.addElement("Santosh");
		v.addElement("Santosh1");
		v.addElement("Santosh2");
		v.addElement("Santosh3");
		v.addElement("Santosh");
		v.addElement("Santosh1");
		v.addElement("Santosh2");
		v.addElement("Santosh3");
		v.addElement("Santosh");
		v.addElement("Santosh1");
		v.addElement("Santosh1");
		System.out.println("Capacity ::::" + v.capacity());
		System.out.println("length ::::" + v.size());
	}
}