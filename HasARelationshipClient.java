
public class HasARelationshipClient {

	public static void main(String[] args) {
		
		 //Main class >>>>>>> Customer
		//Dependent Class >>>>>> Address
	
		Customer c = new Customer();
		
		//calling main class method for setting values of customer object
		c.setCustomerDetails("AIT123", "Hyderabad", 25000.00d);
		
		//Access the dependent class object using main class object.
		c.add.setAddressDetails("1-2-3", "XYZ", "Hyderabad", "256989");
		
		//calling displaying methods for both Main class Object & dependent class object
		c.displayCustomerDetailsInfo();
		c.add.displayAddressInfo();
	}
}