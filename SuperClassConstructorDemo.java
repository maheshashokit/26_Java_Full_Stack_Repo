
public class SuperClassConstructorDemo {

	public static void main(String[] args) {
		
		//creating the object for subclass
		
		//subclass two parameterized constructor
		DisplayDemo dd = new DisplayDemo("AshokIT","Hyderabad");
		
		//calling service method for displaying the data
		dd.displayCollegeName();
		dd.displayCityName();
	}
}