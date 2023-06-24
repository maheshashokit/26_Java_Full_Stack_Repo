package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	
	public static void main(String[] args) {
		
		//creating ThreadPool using Executors Class
		//ExecutorService executorService = Executors.newFixedThreadPool(10);
		System.out.println("Runtime.getRuntime().availableProcessors()" + Runtime.getRuntime().availableProcessors());
		ExecutorService executorService = Executors.newFixedThreadPool(
				              Runtime.getRuntime().availableProcessors());
		
		//submit the task to ExecutorService 
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		executorService.execute(new NaturalNumberTask());
		executorService.execute(new EvenNumberTask());
		
		
		//shutdown the ExecutorService
		executorService.shutdown();
	}
}