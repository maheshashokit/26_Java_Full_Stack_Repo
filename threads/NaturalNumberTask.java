package threads;

import java.time.LocalTime;

public class NaturalNumberTask implements Runnable{
	
	 @Override
	public void run() {
		 System.out.println("Current Thread Name:::::" + Thread.currentThread().getName() + "==="+ LocalTime.now());
		 for(int i = 1 ; i<=10; i++) {
			 System.out.println("Natural Numbers i= "+ i);
		 }
	}
}