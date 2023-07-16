package com.ashokit.collections;

//Instance method References
public class InstanceMethodReferences {

	//this instance method is equal to predicate function interface abstract method behaviour
	public boolean nameLengthChecking(String name) {
		if (name != null) {
			return name.length() > 0;
		} else {
			return false;
		}
	}

	//this instance method is equal to Function function interface abstract method behaviour
	public String nameConversion(String name) {
		if (name != null) {
			return name.toUpperCase();
		} else {
			return null;
		}
	}
}