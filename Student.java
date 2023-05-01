
public class Student {
	
	private int rollNo;
	
	private String name;
	
	//Defining the non-parameterized constructor
	public Student() {
		System.out.println("Student :::: Non-Parameterized Constructor.....");
	}
	
	//Defining the single parameterized constructor
	public Student(int rollNo) {
		this(rollNo,"Mahesh"); //calling the another constructor
		System.out.println("Student:::Single-Parameterized Constructor...");
	}
	
	//Defining the two Parameterized Constructor
	public Student(int rollNo,String name) {
		System.out.println("Student::::Two-Parameterized Constructor.....");
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Roll No::::::" + rollNo);
		System.out.println("Studnet Name   ::::::" + name);
	}

	
	public static void main(String[] args) {
		
		Student s = new Student(01,"Suresh"); //It will call two parameterized constructor
		s.displayStudentInfo();
		
		System.out.println("***************************************************");
	    Student s1 = new Student(25); //It will call one Parameterized constructor
	    s1.displayStudentInfo();
		
	}
}
