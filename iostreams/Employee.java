package iostreams;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String name;
	
	private transient String designation;
	
	public static String companyName="AshoKITHyderabad";

	public Employee() {
		System.out.println("Employee Class Constructor......");
	}
	
	public Employee(String id, String name, String designation) {
		System.out.println("Employee Class Param Constructor......");
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public void display() {
		System.out.println("Employee ID          :::::" + id);
		System.out.println("Employee Name        :::::" + name);
		System.out.println("Employee Designation :::::" + designation);
	}
}