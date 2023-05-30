package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowKeywordDemo {

	public static void main(String[] args) {
		
		 Scanner sc  = new Scanner(System.in);
		 
		 if(sc != null) {
			 
			 System.out.println("Enter First Value");
			 int a  = sc.nextInt();
			 
			 System.out.println("Enter Second Value");
			 int b = sc.nextInt();
			 
			 if(a == 0 || b == 0) {
				 throw new IllegalArgumentException("Values Shouldn't be Zero.....");
			 }else {
				 int sum =  a + b;
				 System.out.println("Addition of two numbers:::::" + sum);
			 }
			 //close the scanner class
			 sc.close();
		 }
	}
	
	public void display() {
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			//create object of userdefined Exception class and throw object.
			throw new NumberFormatException();
		}
	}
	
	
	public void testDisplay() {
		CheckedExceptionClassesDemo cd = new CheckedExceptionClassesDemo();
		try {
			cd.testDemo_1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
