package threads;

import java.time.LocalTime;

public class TimeTask implements Runnable{
	
	int loopNumber;
	
	public TimeTask(int i) {
		this.loopNumber = i;
	}
	
	@Override
	public void run() {
		System.out.println("Thread Execution::::" + Thread.currentThread().getName() + "----"+LocalTime.now() +"======"+ loopNumber);
	}

}
