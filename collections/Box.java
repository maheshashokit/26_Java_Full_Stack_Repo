package com.ashokit.collections;

import java.io.Serializable;

//Generic class to hold any type of data
//upper bound generic
//public class Box<T extends Number> {
public class Box<T extends Number> {

	// Creating the Generic Type of Variable for Contents
	private T contents;

	//Defining the public Constructor
	public Box() {
	
	}
	
	// Defining the Constructor with Typed Parameters
	public Box(T contents) {
		this.contents = contents;
	}

	// setter method with Typed Parameters
	public void setContents(T contents) {
		this.contents = contents;
	}

	// getter method return Typed Parameters
	public T getContents() {
		return contents;
	}

}
