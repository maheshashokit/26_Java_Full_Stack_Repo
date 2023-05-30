package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionClassesDemo {

	public static void main(String[] args) {
		System.out.println("Checked Exception Demo Class..........");
	}
	
	public void display() {
		try {
			super.clone();
		}catch(CloneNotSupportedException cnse) {
			System.out.println(cnse);
		}
	}
	
	public void demo() {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void demoDisplay(){
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void testDemo(){		
		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testDemo_1() throws InterruptedException, FileNotFoundException, ClassNotFoundException{		
		Thread.sleep(500);		
		FileInputStream fis = new FileInputStream("Test.txt");
		Class.forName("java.lang.String");
	}
}
