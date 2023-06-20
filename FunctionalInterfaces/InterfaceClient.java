package FunctionalInterfaces;

public class InterfaceClient {
	
	 public static void main(String[] args) {
		
		 System.out.println("**********Java7 Style Interface-Implementation Class************** ");
		 //creating object for Implementation class
		 DisplayImpl d = new DisplayImpl();
		 
		 //calling Implementation method 
		 d.displayData();
		 
		 System.out.println("*************Java8 Style Interface-Implementation Class*************");
		
		 Display d1 = ()-> {
			 System.out.println("Welcome To Java Full Stack Development");
			 System.out.println("Welcome To Ashok IT Java Functional Interface.....");
		 };
		 //we need to call the interface abstract method so that implementation will be executed
		 d1.displayData();
		 
		 System.out.println("************Addition Function Interface Implementation using Lambda*************");
		 
		 Addition a1  = (a,b) -> {
			 System.out.println("Addition of Two Numbers Using Functional Interface::::" + (a+b));
		 };
		 //call the abstract method from Funtional Interface
		 a1.doAddition(10,30);
		 
		 System.out.println("**********PasswordTest Functional Interface Implementation using Lambda********");
		 PasswordTest pwd  = (password) -> {
			 if("ashokit".equalsIgnoreCase(password)) {
				 System.out.println("Password as expected");
				 return true;
			 }else {
				 System.out.println("Password as not expected");
				 return false;
			 }			  
		 };		 
		 //call the abstract method from Functional Interface
		 System.out.println("PasswordStatus::::" + pwd.verifyPassword("Mahesh"));
		 System.out.println("PasswordStatus::::" + pwd.verifyPassword("ASHOKIT"));
		 System.out.println("PasswordStatus::::" + pwd.verifyPassword("Suresh"));
		 System.out.println("PasswordStatus::::" + pwd.verifyPassword("Mahesh"));
		 System.out.println("PasswordStatus::::" + pwd.verifyPassword("Nagesh"));
	}
}