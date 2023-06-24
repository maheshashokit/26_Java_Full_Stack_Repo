package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for(int i =1; i<=5;i++) {
			Future<Integer> submit = executorService.submit(new RandomNumberThread());
			System.out.println(submit.get());
		}
	}
}