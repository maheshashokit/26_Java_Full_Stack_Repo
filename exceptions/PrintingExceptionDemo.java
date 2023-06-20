package exceptions;

public class PrintingExceptionDemo {
	
	public static void main(String[] args) {
		
		
		  try {
			  
			    int c  = 25 / 0;
			    System.out.println("C = " + c);
			    System.err.println("C1 =" +c);
			  
		  }catch(ArithmeticException ae) {
			  System.out.println("Inside the Catch Block...");
			  //System.out.println(ae);//ExceptionType + Exception Description
			  //System.out.println("Exception Message:::::" + ae.getMessage());//Exception Description
			  ae.printStackTrace();
		  }
	}

}
