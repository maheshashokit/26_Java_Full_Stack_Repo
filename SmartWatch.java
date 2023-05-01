
public class SmartWatch extends BasicWatch {
	
	private double temperature;
	
	//Non-Parameterized Constructor
	public SmartWatch() {
		System.out.println("SmartWatch::::Default Constructor");
	}
	
	//Defining the Method for setting temperature value
	public void setTemperatureForWatch(double temperature) {
		 this.temperature = temperature;
	}
	
	//Defining the Method for displaying temperature value
	public void displayTemperatureInfo() {
		System.out.println("Current Temperature :::::" + temperature);
	}
	
	//Defining some more actions related to SmartPhone
	public void displayHealthInfo() {
	   System.out.println("SmartWatch::::: Displaying Health Information...");	
	}
	
	public void messaging() {
       System.out.println("SmartWatch::::: Messaging From SmartWatch");		
	}
}
