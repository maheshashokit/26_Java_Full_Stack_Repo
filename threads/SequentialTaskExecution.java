package threads;

public class SequentialTaskExecution {
	
	public static void main(String[] args) {
		// Create the tasks
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();

		// Create the threads
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);

		try {
			// Start the first thread
			thread1.start();
			// Wait for the first thread to complete
			thread1.join();

			// Start the second thread
			thread2.start();
			// Wait for the second thread to complete
			thread2.join();

			// Start the third thread
			thread3.start();
			// Wait for the third thread to complete
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// Task 1
class Task1 implements Runnable {
	@Override
	public void run() {
		// Code for task 1
		System.out.println("Executing Task 1");
		for (int i = 1; i <= 20; i++) {
			System.out.println("Task-1 Execution::::" + i);
		}
	}
}

// Task 2
class Task2 implements Runnable {
	@Override
	public void run() {
		// Code for task 2
		System.out.println("Executing Task 2");
		for (int i = 1; i <= 20; i++) {
			if(i % 2 ==0) {
				System.out.println("Task-2 Execution::::" + i);
			}
		}
	}
}

// Task 3
class Task3 implements Runnable {
	@Override
	public void run() {
		// Code for task 3
		System.out.println("Executing Task 3");
		for (int i = 1; i <= 20; i++) {
			if(i % 2 !=0) {
				System.out.println("Task-3 Execution::::" + i);
			}
		}
	}
}
