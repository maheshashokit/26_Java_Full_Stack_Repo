
public class MultiLevelInheritanceMainClient {

	public static void main(String[] args) {
		
		//creating object for SmartWatch Class
		SmartWatch sw = new SmartWatch();
		
		//Accessing the Watch Class method using SmarWatch Class Object
		sw.setTimeForWatch(8, 04, 26);
		
		//Accessing the BasicWatch Class Method using SmartWatch Class object
		sw.setDateForWatch(01, "Apr", 2023);
		
		//Accessing the SmartWatch Class method using SmartWatch Class object
		sw.setTemperatureForWatch(23.54d);
		
		//Accessing the respective display method using SmartWatch Class object
		sw.displayTimeInfo();
		sw.displayDateInfo();
		sw.displayTemperatureInfo();
		sw.displayHealthInfo(); //Calling Additional Services from SmartWatch Class
		sw.messaging();//Calling Additional Services from SmartWatch Class
   }
}