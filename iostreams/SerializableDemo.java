package iostreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("employee.ser");
			ObjectOutputStream oos  = new ObjectOutputStream(fos);){
			
			System.out.println("Inside the Serialization logic.....");
			
			//preparing the object of information
			Employee emp = new Employee("AIT123","Mahesh","Software Engineer");
			Employee emp1 = new Employee("AIT345","Ashok","Tech Lead");
			
			//writing the object into oos
			oos.writeObject(emp);
			oos.writeObject(emp1);
			
			System.out.println("Serialization Got Completed........");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}