package FunctionalInterfaces;

public class DefaultInterfaceMethodClient {
	
	public static void main(String[] args) {
		
		Payment payment = new Phonepe();
		payment.security();//calling default method
		payment.doPayment();
		payment.getTransactionDetails();
		payment.scratchCard();//calling default method
		
		//calling the static methods of an interface using interface name
		Payment.display();
		Payment.displayMessage("Static Methods From Interfaces");
		
		
		System.out.println("*****************************");
		payment = new GooglePay();//calling default method
		payment.security();
		payment.doPayment();
		payment.getTransactionDetails();
		payment.scratchCard();//calling default method
		
		//calling the static methods of an interface using interface name
		Payment.display();
		Payment.displayMessage("Static Methods From Interface");
		
		//Performing the operation using lambda
		PasswordTest pt = username -> {
			                            return "Mahesh".equalsIgnoreCase(username);
			                          };
	     System.out.println(pt.verifyPassword("Mahesh"));		                          
	}
}