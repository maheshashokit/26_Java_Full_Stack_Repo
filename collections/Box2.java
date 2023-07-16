package com.ashokit.collections;

//Generic class to hold any type of data
public class Box2<T> {

	// Creating the Generic Type of Variable for Contents
	private T contents;

	//Defining the public Constructor
	public Box2() {
	
	}
	
	// Defining the Constructor with Typed Parameters
	public Box2(T contents) {
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
