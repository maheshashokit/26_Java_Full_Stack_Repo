package threads;

public class ThreadClient {
	
	public static void main(String[] args) {
		
		//creating the Object of NumberThread class
		NumberThread nt  = new NumberThread();
		//setting name for my thread
		nt.setName("Ashok-Thread");
		//start the thread execution
		nt.start();
		
		//creating the one more thread 
		NumberThread nt1 = new NumberThread();
		//setting another name for new thread
		nt1.setName("Mahesh-Thread");
		//start the thread execution
		nt1.start();
	}}
