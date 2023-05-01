//Specialized Watch
public class BasicWatch extends Watch{
	public int day;
	public String month;
	public int year;
	
	//Non-Parameterized Constructor
	public BasicWatch() {
		System.out.println("BasicWatch::::: Constructor....");
	}
	
	//setting the date value for BasicWatch
	public void setDateForWatch(int day,String month,int year) {
		this.day = day;
		this.month = month;
		this.year =year;
	}
	
	//Defining the business method for display date value
	public void displayDateInfo() {
		System.out.println("Current Date:::::" + day + "-"+ month +"-"+ year);
	}
}