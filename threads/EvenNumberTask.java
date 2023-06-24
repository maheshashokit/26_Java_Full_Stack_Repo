package threads;

public class EvenNumberTask implements Runnable {

	@Override
	public void run() {
		 System.out.println("Current Thread Name:::::" + Thread.currentThread().getName());
		 for(int i = 1 ; i<=10; i++) {
			 if(i % 2 == 0) {
				 System.out.println("Even Numbers i= "+ i);
			 }
		 }
	}
}