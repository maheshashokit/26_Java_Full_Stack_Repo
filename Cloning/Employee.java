package cloning;

public class Employee implements Cloneable{
	
	public String employeeId;
	public String name;
	public float salary;
	
	//creating the object for Address Information
	public Address add = new Address("Ameerpet","Hyderabad");
	
	public JobDetails jd = new JobDetails("SoftwareEngineer","A3");

	public Employee() {
		System.out.println("Employee Class Public Constructor....");
	}
	
	public Employee(String employeeId, String name, float salary) {
		System.out.println("Employee Class Public Param Constructor....");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID     :::::" + employeeId);
		System.out.println("Employee Name   :::::" + name);
		System.out.println("Employee Salary :::::" + salary);
		//calling the Address Class method
		add.displayAddressDetails();
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
	     Object clonedObject = super.clone();
	     
	     //Type casting the clonedObject property from Object to Employee
	     Employee emp = (Employee)clonedObject;
	     
	     //We are instructing to JVM to perform the Address Object to be clone.
	     this.add = add.clone();

	     return emp;
	}
}