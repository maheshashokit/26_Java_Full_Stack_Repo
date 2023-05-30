package exceptions;

import java.util.Scanner;

public class CustomerUserDefinedExceptionDemo {
	
	public static void main(String[] args) {
		
		//created some customer objects
		Customer customer1 = new Customer("AIT123","Mahesh");
		Customer customer2 = new Customer("AIT321","Suresh");
		Customer customer3 = new Customer("AIT122","Ramesh");
		Customer customer4 = new Customer("AIT234","Rajesh");
		Customer customer5 = new Customer("AIT456","Nagesh");
	   
		//Created the Customer array for storing customer information
		Customer[] customers = {customer1,customer2,customer3,customer4,customer5};
		
		//Creating the scanner class by taking input from client to search customers based on the cusotmerid
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer-ID To Search......");
		String searchCustomerId = sc.next();//AIT888	
		
		boolean customerSearch = false;
		//displaying the customer information
		for(Customer cust : customers) {
			//searching the cusotmerId from list of customers if not throw the exception
			if(searchCustomerId.equals(cust.getId())) {
				System.out.println(cust);
				customerSearch = true;
				break;
			}
		}
		
		if(!customerSearch) {
			throw new CustomerNotFoundException("Customer Not Found with CustomerId %s" , searchCustomerId);
		}
	}
}