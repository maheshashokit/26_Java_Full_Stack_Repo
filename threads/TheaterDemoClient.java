package threads;

public class TheaterDemoClient {
	
	public static void main(String[] args) {
		
		//Creating the object for TheaterDemo Class for representing the two tasks
		TheaterDemo td  = new TheaterDemo("Verifying the Ticket.......");
		TheaterDemo td1  = new TheaterDemo("Showing the Seat Layout........");
		
		//Hand over the above two tasks for two threads
		Thread t  = new Thread(td);
		Thread t1 = new Thread(td1);
		
		//starting the execution of thread
		t.start();
		t1.start();
	}
}