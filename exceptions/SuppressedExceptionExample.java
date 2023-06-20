package exceptions;

public class SuppressedExceptionExample {
   
	public static void main(String[] args) throws Exception  {
        try {
            // Some code that may throw an exception
            throw new Exception("Exception 1");
        } catch (Exception e) {
            // Catch the exception
            System.out.println("Caught exception: " + e.getMessage());
            
        } finally {
            // This code will always execute, regardless of whether an exception was thrown or caught
            System.out.println("Finally block");
            
            try {
                // Some code that may throw an exception in the finally block
                throw new Exception("Exception in finally");
            } catch (Exception e) {
                // Catch the exception in the finally block
                System.out.println("Caught exception in finally: " + e.getMessage());
            }
        }
    }
}
