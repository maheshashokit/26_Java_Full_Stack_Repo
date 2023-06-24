package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		for(int i = 1; i<=5; i++) {
			executorService.execute(new TimeTask(i));
		}
		
		executorService.shutdown();
	}

}
