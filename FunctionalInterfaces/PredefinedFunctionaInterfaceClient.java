package FunctionalInterfaces;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionaInterfaceClient {
	
	public static void main(String[] args) {
	
	 
	 Predicate<String> usernameTest = (username) -> {
									     if("mahesh".equalsIgnoreCase(username)) {
								              return true;	
								         }else {
								        	  return false;
								         }
  									  };
  	  //calling the abstract method
      System.out.println("Test:::" + usernameTest.test("Mahesh"));//true							 
      System.out.println("Test:::" + usernameTest.test("Ashok"));//false 									 
      System.out.println("Test:::" + usernameTest.test("Suresh"));//false 	
      
      System.out.println("********************************************************");
      
      Function<String,Integer> functionTest = (String str) -> {
    	                                          return Integer.valueOf(str);
                                              };
      Customer customer = new Customer("AIT123","Pune",25000d);                                        
      
      Function<Customer,String> customerTest = (Customer cust) -> {
    	  										   return cust.cityName;
      											};                                     
      //calling the abstract method
      System.out.println("Printing Value::::" + functionTest.apply("123"));
      System.out.println("Printing Value::::" + functionTest.apply("123456"));
      System.out.println("Printing Value::::" + functionTest.apply("89797"));
      System.out.println("Customer Print:::::"+ customerTest.apply(customer));
      
      System.out.println("**********************************************************");
      Consumer<Customer> customerConsumer = (Customer cust) -> {
    	                                        System.out.println("CustomerId "+ cust.customerId);
    	                                        System.out.println("CityName "+ cust.cityName);
    	                                        System.out.println("BillAmount :::" + cust.billAmount);
      										 };
      										 
      Consumer<String[]> stringConsumer = (String[] str)->{
    	  	for(String names :str) {
    	  		System.out.println("Name :::" + names);
    	  	}
      };  										 
      //calling the abstract method
      customerConsumer.accept(customer);
      stringConsumer.accept(new String[] {"Mahesh","Suresh","Naresh","Rajesh"});
      
      System.out.println("****************************************************************");
      
       Supplier<Customer> suplierCust = () -> {
    	   //return new Customer("AIT123232","Sukumar",35000d);
    	   return customer;
       };
       System.out.println("Supplier Customer" + suplierCust.get().customerId);
       System.out.println("Supplier Customer" + suplierCust.get().cityName);
       System.out.println("Supplier Customer" + suplierCust.get().billAmount);
	}
}