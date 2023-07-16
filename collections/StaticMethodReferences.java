package com.ashokit.collections;

//static method References
public class StaticMethodReferences {

	public static boolean nameLengthChecking(String name) {

		if (name != null) {
			return name.length() > 0;
		} else {
			return false;
		}
	}

	public static String nameConversion(String name) {
		if (name != null) {
			return name.toUpperCase();
		} else {
			return null;
		}
	}
}