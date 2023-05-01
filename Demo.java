//This is parent class
public class Demo {
	
	public String collegeName = "AshokIT";
	
	//Defining the Non-Parameterized Constructor
	public Demo() {
		System.out.println("Demo Class :::: Non-Parameterized Constructor.....");
	}
	
	//Defining the Parameterized Constructor
	public Demo(String collegeName) {
		System.out.println("Inside the Demo Class Parameterized Constructor.....");
		this.collegeName = collegeName;
	}
	
	//Defining the service method for displaying collegeName
	public void displayCollegeName() {
	   System.out.println("College Name ::::::" + collegeName);
	}
}