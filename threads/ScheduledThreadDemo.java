package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadDemo {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
		
		//executorService.scheduleAtFixedRate(new NaturalNumberTask(), 5, 5,TimeUnit.SECONDS);
	    executorService.scheduleWithFixedDelay(new NaturalNumberTask(), 5, 5,TimeUnit.SECONDS);
		
	}
}
