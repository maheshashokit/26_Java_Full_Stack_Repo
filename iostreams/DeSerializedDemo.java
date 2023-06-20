package iostreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializedDemo {

	public static void main(String[] args) {
		
		try( FileInputStream fis = new FileInputStream("employee.ser");
			 ObjectInputStream ois = new ObjectInputStream(fis);	
		  ){
			
			 Employee emp1 = (Employee) ois.readObject();    
             Employee emp2 = (Employee) ois.readObject();
             
             //calling the business method
             emp1.display();
             System.out.println("Employee Company Name :::::" + Employee.companyName);
             System.out.println("**********************************");
             emp2.display();
             System.out.println("Employee Company Name :::::" + Employee.companyName);
            
		}catch(Exception e) {
			
		}
	}

}
