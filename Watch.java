//Generalized Class for Watch Activity
public class Watch {

	// Fields
	public int hours;
	public int minutes;
	public int seconds;

	// Non-Parameterized Constructor
	public Watch() {
		System.out.println("Watch Class::::::Constructors");
	}

	// Initializing values for Fields
	public void setTimeForWatch(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	// displaying time information
	public void displayTimeInfo() {
		System.out.println("Current Time  " + hours + " : " + minutes + " : " + seconds);
	}
}