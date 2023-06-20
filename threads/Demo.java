package threads;

public class Demo {
	
	public static void main(String[] args) {
		
		//Getting to know about current thread running in our program
		Thread thread = Thread.currentThread();
		System.out.println("Welcome To Ashok IT.......");
		//Displaying the Thread information
		System.out.println("Thread Information ::::: "+ thread);
		//changing the name of Thread
		thread.setName("AshokIT");
		//We are getting latest name of the Thread
		System.out.println("Thread Name :::::" + thread.getName());
		//We are getting ThreadGroup Name
		System.out.println("Thread Group Name :::::" + thread.getThreadGroup().getName());
		//we are getting Thread Priority
		System.out.println("Thread Priority ::::::" + thread.getPriority());
	}
}
