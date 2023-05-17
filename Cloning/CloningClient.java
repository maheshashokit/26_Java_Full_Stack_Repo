package cloning;

public class CloningClient {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("**************Main Object****************");	
		//Creating the object for Employee class
		Employee emp = new Employee("AIT123","Mahesh",25000f);
		
		//calling displayEmployeeDetails()
		emp.displayEmployeeDetails();
		
		//calling hashcode method for getting to know about main object
		System.out.println("Main Object HashCode:::::" + emp.hashCode());//112233
		System.out.println("Address Object HashCode in Main Object:::::" + emp.add.hashCode());//123

		System.out.println("**************Cloned Object****************");	
		Employee emp1 = emp.clone();
		//calling the displayEmployeeDetails()
		emp1.displayEmployeeDetails();
		
		//calling hashcode method for getting to know about Cloned object
	    System.out.println("Cloned Object HashCode:::::" + emp1.hashCode());//334455
	    System.out.println("Address Object HashCode in Cloned Object:::::" + emp1.add.hashCode());//345

	    System.out.println("****************Doing Changes in cloned object verify main object************** ");
  		//emp1.name="Ashok";
  		//emp1.salary=35000.00f; 
  	
        //changing address properties using cloned object
  		emp1.add.cityName="Pune";
	    
  		emp.displayEmployeeDetails();
	   
  		System.out.println("Address Object HashCode in Main Object:::::" + emp.add.hashCode());//345
	    System.out.println("JobDetails Object HashCode in Main Object:::::" + emp.jd.hashCode());//345
	    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	   
	    emp1.displayEmployeeDetails();
	   
	    System.out.println("Address Object HashCode in Cloned Object:::::" + emp1.add.hashCode());//345
	    System.out.println("JobDetails Object HashCode in Cloned Object:::::" + emp1.jd.hashCode());//345
	    
	    if(emp.add.hashCode() == emp1.add.hashCode() && emp.jd.hashCode() == emp1.jd.hashCode()) {
	    	System.out.println("Shallow Cloning....");
	    }else {
	    	System.out.println("Deep Cloning.....");
	    }
	}
}