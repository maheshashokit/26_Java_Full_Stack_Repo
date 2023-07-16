package com.ashokit.collections;

public class MyClass {
	
	private int a;
	
	private int b;
	
	public MyClass() {
		System.out.println("MyClas Constructor....");
	}
	
	public MyClass(int a) {
		this.a = a;
	}
	
	public MyClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
}
