package threads;

public class TheaterDemo extends Thread{
	
	//Taking one variable to represent the task name
	public String taskName;
	
	//Defining the Constructor
	public TheaterDemo(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {		
		//Defining the logic to execute 20 customer for a thread
		for(int i=1 ; i<=20 ;i++) {
			System.out.println(taskName + " : " + i);			
			//holding the task for sometime
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}