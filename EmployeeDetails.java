
public class EmployeeDetails {
	
	//Define the Fields for Employee
	String id; //employee id is an alphanumeric(AIT123)
	String name; //group of characters
	double salary; //salary will have decimal points
	String designation; //group of characters
	String gender;//group of characters
	
	//Define the Methods for Employee
	void canLogin() {
	   System.out.println("Employee :::: canLogin() Called......");
	}
	
	void trackIssueLog() {
		System.out.println("Employee :::: trackIssueLog() Called.....");
	}
	
	int workingIssuesToday(int issueCount) {
		System.out.println("Today Planning to Work " +issueCount+" Issues ::::");		
		return issueCount;
	}
	
	int completedIssuesToday(int issueCount) {
		System.out.println("Completed Issues :::" + issueCount);
		return issueCount;
	}
	
	void canLogout() {
		System.out.println("Employee :::: canLogout() called......");
	}
	
	//Defining Java method for performing Initialization Activity 
	//i.e.,Assigning some values to Fields of a Class
	void assignValues(String empId,String empName,
			          double empSalary,String empDesignation,
			          String empGender) {
		//assigning the Inputs to Fields of Java Class
		id = empId;
		name = empName;
		salary = empSalary;
		designation = empDesignation;
		gender = empGender;	
	}
	
	//Defining the Java Method for displaying employee information
	void displayEmployeeData() {
	   System.out.println("Employee ID          :::::::" + id);	
	   System.out.println("Employee Name        :::::::" + name);	
	   System.out.println("Employee Salary      :::::::" + salary);	
	   System.out.println("Employee Designation :::::::" + designation);	
	   System.out.println("Employee Gender      :::::::" + gender);	
	}
	
	//Defining the Java method to calculate the Pending Issues
	void pendingIssuesInformation(int totalIssues,int workedIssues) {
		
		System.out.println("Pending Issues Information ::::::" + (totalIssues - workedIssues));
		
	}
	
	public static void main(String[] args) {
		
		//Create an objects
	    EmployeeDetails maheshObj = new EmployeeDetails();
	    
	    //perform some initialization through Method calling
	    maheshObj.assignValues("AIT123", "Mahesh", 25000.00d, "Java Consultant", "Male");
	    
	    //Accessing the Fields using objectname with Accessor Operators
	    maheshObj.displayEmployeeData();
	    
	    //Accessing the Methods using objectname with Accessor Operator
	    maheshObj.canLogin();
	    maheshObj.trackIssueLog();
	    maheshObj.pendingIssuesInformation(maheshObj.workingIssuesToday(3), maheshObj.completedIssuesToday(2));
	    maheshObj.canLogout();
	    
	    System.out.println("*************************************************************");
	    
	    //create one more Object for Employee class
	    EmployeeDetails ashokObj = new EmployeeDetails();
	    
	    //perform some initialization
	    ashokObj.assignValues("AIT234", "Ashok", 75000.00d, "Senior Java Consultant", "Male");
		   
	    //Accessing the Fields using objectname with Accessor Operators
	    ashokObj.displayEmployeeData();
	    
	    //Accessing the Methods using objectname with Accessor Operator
	    ashokObj.canLogin();
	    ashokObj.trackIssueLog();
	    ashokObj.pendingIssuesInformation(ashokObj.workingIssuesToday(15), ashokObj.completedIssuesToday(10));
	    ashokObj.canLogout();
	    
	    System.out.println("**************************************************************");
	    EmployeeDetails sureshObj = new EmployeeDetails();
	    
	    //calling assignValues method for initialization
	    sureshObj.assignValues("AIT555", "Suresh", 35000.00d, "Quality Analyst", "Male");
	    
	    //calling displayEmployeeData method for displaying values
	    sureshObj.displayEmployeeData();
	    
	    //Accessing the Methods using objectname with Accessor Operator
	    sureshObj.canLogin();
	    sureshObj.trackIssueLog();
	    sureshObj.pendingIssuesInformation(sureshObj.workingIssuesToday(10), sureshObj.completedIssuesToday(10));
	    sureshObj.canLogout();
	    
	    System.out.println("**************************************************************");
	    
	    CustomerDetails demoCustomer = new CustomerDetails();
	    System.out.println("Customer ID ::::" + demoCustomer.id);
	    System.out.println("Customer Name:::::"+ demoCustomer.name);
	    
	    demoCustomer.displayCustomerInformation();
	    
	    
	}
}