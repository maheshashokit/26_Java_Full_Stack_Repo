package com.ashokit.collections;

public enum Status {
	
	ACTIVE("Active",1),
	INACTIVE("InActive",2);
	
	private String name;
	private Integer value;
	
	Status() {
	}
	
	Status(String name, Integer value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getValue() {
		return value;
	}
}