package exceptions;

//User defined Exception class
public class CustomerNotFoundException extends RuntimeException {
	
	//Defining the Constructors
	public CustomerNotFoundException() {
		//calling the super class public non-parameterized constructor
		super();
	}
	
	//Defining the public Parameterized Constructor
	public CustomerNotFoundException(String errorMessage,String customerId) {
		//calling the super class public parameterized constructor
		super(String.format(errorMessage, customerId));
	}

}
