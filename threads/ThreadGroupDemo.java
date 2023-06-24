package threads;

public class ThreadGroupDemo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread Name ::::" + Thread.currentThread().getName() + " is Running......");
		System.out.println("Current ThreadGroup Name::::" + Thread.currentThread().getThreadGroup().getName());
	}
	
	public static void main(String[] args) {
		
		//creating the object of ThreadGroup class
		ThreadGroup tg = new ThreadGroup("ashokit");
		
		//creating subgroup of thread from main group
		ThreadGroup tg1 = new ThreadGroup(tg, "students");
		
		//creating subgroup of thread from main group
		ThreadGroup tg2 = new ThreadGroup(tg, "employees");
		
		//creating the threads and adding them to ThreadGroup
		Thread t1 = new Thread(tg2, new ThreadGroupDemo(),"Mahesh Thread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(tg2, new ThreadGroupDemo(),"Ashok Thread");
		t2.setPriority(Thread.MIN_PRIORITY);
		Thread t3 = new Thread(tg1, new ThreadGroupDemo(),"Suresh Thread");
		Thread t4 = new Thread(tg1, new ThreadGroupDemo(),"Ramesh Thread");
		
		
		
		//start the Thread Execution
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//Will get the list of threads in execution
		System.out.println("*************************");
		tg.list();
		System.out.println("******************************");
		System.out.println("Thread Active count From ThreadGroup :::::" + tg.activeGroupCount());
	}
}