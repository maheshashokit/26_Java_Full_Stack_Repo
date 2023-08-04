package com.ashokit.singleton;

public class LazyInitialization implements Cloneable {

	// Lazy Initialization
	private static LazyInitialization instance;

	// Private constructor to prevent direct instantiation
	private LazyInitialization() {
	}

	// Method to get the singleton instance
	public static LazyInitialization getInstance() {
		if (instance == null) {   //t1 & t2  >>>>>>>>>>>>>>t3(Cloneable),t4(Serialization)
			synchronized (instance) {   //t1,t2
				// if instance is null, initialize
				if(instance == null) {
				  instance = new LazyInitialization();
				}
			}
		}
		return instance;//t1 instance
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		throw new CloneNotSupportedException();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}