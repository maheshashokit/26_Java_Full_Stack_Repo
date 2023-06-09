package exceptions;

public class SuppressedExceptionDemo {
	
	public static void main(String[] args) {
		
		try(MyResource resource = new MyResource()){
			
			resource.doSomething();  //Exception during resource usage
			//Exception during resource cleanup
			
		}catch(Exception e) {
			System.out.println("Caught exception: " + e.getMessage());
            Throwable[] suppressedExceptions = e.getSuppressed();
            for (Throwable suppressedException : suppressedExceptions) {
                System.out.println("Suppressed exception: " + suppressedException.getMessage());
            }
		}
	}
}