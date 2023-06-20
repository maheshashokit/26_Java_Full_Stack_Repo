package threads;

//creating the user defined Thread....
public class NumberThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 1 ; i<=100 ; i++) {
			System.out.println("Current Thread Name ::::::" + Thread.currentThread().getName());
			System.out.println("This is Number Thread::::: " + i);
		}
	}
}