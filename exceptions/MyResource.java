package exceptions;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Inside the close()........Method......");
		throw new Exception("Exception during resource cleanup");
	}
	
	public void doSomething() throws Exception {
		System.out.println("Inside the doSomething().........");
        throw new Exception("Exception during resource usage");
    }
}