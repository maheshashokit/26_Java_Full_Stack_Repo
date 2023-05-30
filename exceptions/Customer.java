package exceptions;

import java.io.IOException;

public class Customer implements java.io.Closeable{
	
	private String id;
	
	private String name;

	public Customer() {
		System.out.println("Customer class Constructor");
	}	
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
}