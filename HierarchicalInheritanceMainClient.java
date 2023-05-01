
public class HierarchicalInheritanceMainClient {

	public static void main(String[] args) {
		
		//Creating SubClass Object i.e.,Employee Class
		Employee emp = new Employee();

		//calling the Person Class Methods using sub class object
		emp.setPersonDetails("Mahesh", "mahesh.ashokit@gmail.com", "1234567890");
		
		//calling the Employee class method using sub class object
		emp.setEmployeeDetails("AIT123", "Software Engineer", 25000.00d, "A3");
		
		//calling respective display methods using sub class object
		emp.displayPersonalDetailsInfo();
		emp.displayEmployeeDetailsInfo();
		
		System.out.println();
		
		//Creating sub class object i.e.,Customer class
		Customer c = new Customer();
		
		//calling the Person class method using sub class object
		c.setPersonDetails("Ashok", "ashokit@gmail.com", "1122334455");
        
		//calling the Customer class method using sub class object
		c.setCustomerDetails("AIT123", "Hyderabad", 5600.25d);
		
		//calling respective display methods using sub class object
		c.displayPersonalDetailsInfo();
		c.displayCustomerDetailsInfo();
	}
}