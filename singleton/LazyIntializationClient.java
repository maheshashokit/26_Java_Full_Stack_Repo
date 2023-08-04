package com.ashokit.singleton;

public class LazyIntializationClient {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		/*LazyInitialization object1 = LazyInitialization.getInstance();
		System.out.println(object1.hashCode());
		
		LazyInitialization object2 = LazyInitialization.getInstance();
		System.out.println(object2.hashCode());
		
		LazyInitialization object3 = LazyInitialization.getInstance();
		System.out.println(object3.hashCode());
		
		LazyInitialization object4 = LazyInitialization.getInstance();
		System.out.println(object4.hashCode());
		
		LazyInitialization object5 = LazyInitialization.getInstance();
		System.out.println(object5.hashCode());*/
		
		System.out.println("*******************************************");
		
		//LazyInitialization lt  = (LazyInitialization) object1.clone();
		//System.out.println(lt.hashCode());
		
		System.out.println();
		
		Runnable task = ()-> {
			LazyInitialization lt = LazyInitialization.getInstance();
			System.out.println("HTTT:::" + lt.hashCode());
		};
		
		Runnable task1 = ()-> {
			LazyInitialization lt = LazyInitialization.getInstance();
			System.out.println("HTTT:::" + lt.hashCode());
		};
		
		Runnable task3 = ()-> {
			LazyInitialization lt = LazyInitialization.getInstance();
			System.out.println("HTTT:::" + lt.hashCode());
		};
		
		//Creating the Threads
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task1);
		Thread t3 = new Thread(task3);
		
		//start the Thread
		t1.start();
		t2.start();
		t3.start();
	}
}
