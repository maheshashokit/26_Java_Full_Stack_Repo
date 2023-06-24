package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
	
	public static void main(String[] args) {
		
		//Creating ExecutorService Instance
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//submit the task to executorService
		for(int i = 1 ; i <=10; i++) {
			executorService.execute(new EvenNumberTask());
		}
		
		//shutdown the ExecutorService
		executorService.shutdown();
	}
}