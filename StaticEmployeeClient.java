
public class StaticEmployeeClient {
	
	public static void main(String[] args) {
		
		StaticEmployee se = new StaticEmployee(12, "Ashok");
	    se.displayEmployeeInfo();
	    //se.displayCompanyName();//not recommended
	    
	    //Accessing the static method using Class Name
	    StaticEmployee.displayCompanyName();
	    
	    //Accessing the static Field using Class Name
	    System.out.println(StaticEmployee.companyName);
		
	}

}
