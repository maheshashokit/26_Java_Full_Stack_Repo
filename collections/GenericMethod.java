package com.ashokit.collections;

public class GenericMethod {
	
	public static void main(String[] args) {
		display(new Employee(123,"Mahesh"));
		display(new Person());
		display("Welcome To AshokIT");
		display(10);
		//TwoParameterized Generic Method Calling
		display("Mahesh","Kumar");
		display("Mahesh","Test@123");
	}
	
	public static <T> void display(T content) {
		System.out.println(content);
	}
	
	public static <T,V> void display(T content, T content1) {
		System.out.println("Content:::" + content);
		System.out.println("Content1::" + content1);
	}
}
