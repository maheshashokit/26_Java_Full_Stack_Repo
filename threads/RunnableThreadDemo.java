package threads;

import java.util.stream.IntStream;

public class RunnableThreadDemo{
	
	public static void main(String[] args) {
		
		
		//Defining Even Numbers Task as Thread 
	   Runnable evenNumberTask =  () -> {
									    	System.out.println("EvenNumber Thread Task.....");
									    	for(int i = 1 ; i<=20 ;i++) {
									    		if(i % 2 == 0) {
									    			System.out.println("EvenNumber Thread:::::" + i);
									    		}
									    	}
	    								};
	    								
	    //Defining the Odd Numbers Task as Thread
		Runnable oddNumberTask =  () -> {
									    	  System.out.println("OddNumber Thread Task.....");
									    	  IntStream.range(1, 21)
	 								    	 .filter(eachNumber -> eachNumber % 2 != 0)
  	 								    	 .forEach(oddNumber -> System.out.println("Odd Number Thread:::::" + oddNumber));
										};
										 
	   //Creating Multiple Threads
	  Thread t1 = new Thread(evenNumberTask);
	  
	  Thread t2 = new Thread(oddNumberTask);
	  
	  //start executing the thread
	  t1.start();
	  
	  //start executing the thread
	  t2.start();

	}

}
