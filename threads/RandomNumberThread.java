package threads;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberThread implements Callable<Integer>{
	
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return new Random().nextInt(10000,15000);
	}
}