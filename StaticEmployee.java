
public class StaticEmployee {
	
	int employeeId;	
	String employeeName;
	static String companyName ="Ashok IT";
	
	//Defining the constructor
	public StaticEmployee(int employeeId,String employeeName) {
		this.employeeId  = employeeId;
		this.employeeName = employeeName;
	}
	
	//Defining the non-static method
	public void displayEmployeeInfo() {
		System.out.println("Employee ID ::::: " + employeeId);
		System.out.println("Employee Name ::: " + employeeName);
		System.out.println("Company Name :::: " + companyName);//Accessing Static Fields
	}
	
	//Defining the static method
    public static void displayCompanyName() {
    	System.out.println("Company Name::::::" + companyName);
    } 
}