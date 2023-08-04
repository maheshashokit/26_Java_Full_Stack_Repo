package com.ashokit.singleton;

public class EarlyIntialization {

	//Early Initialization
	private static EarlyIntialization instance = new EarlyIntialization();

	// Private constructor to prevent direct instantiation
	private EarlyIntialization() {
	}

	// Method to get the singleton instance
	public static EarlyIntialization getInstance() {
		return instance;
	}
}