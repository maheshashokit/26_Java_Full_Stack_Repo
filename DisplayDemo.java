//This is sub class for Parent Class
public class DisplayDemo extends Demo {
	
	private String cityName = "Delhi";
	
	//Non-Parameterized Constructor
    public DisplayDemo() {
    	super();//calling super class non-parameterized constructor explictly
    	System.out.println("DisplayDemo:::: class Constructor....");
    }
    
    //Parameterized Constructor
    public DisplayDemo(String collegeName,String cityName) {
       super(collegeName);//calling super class parameterized constructor explictly
       System.out.println("DisplayDemo Class Parameterized Constructor....");
       this.cityName = cityName;
    }
    
    //Defining the service method for displaying cityName
    public void displayCityName() {
    	System.out.println("City Name ::::::" + cityName);
    }
    
    //Adding new method
    public void displayDetails() {
    	System.out.println("City Name    :::::::::" + cityName);
    	//System.out.println("College Name :::::::::" + super.collegeName); //Calling the super class field from sub class method
    	super.displayCollegeName(); //calling the super class method from sub class method 
    }
 }