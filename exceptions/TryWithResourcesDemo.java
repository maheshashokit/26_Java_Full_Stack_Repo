package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResourcesDemo {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		try(
			 //Reading data from keyboard
		     Scanner sc = new Scanner(System.in);
		     //Reading data from file
			 FileInputStream fis = new FileInputStream("src/test.txt");
			 //Writing data into file
			 FileOutputStream fos = new FileOutputStream("src/test.txt");
			 //Defining the Customer Resource
			 Customer cust  = new Customer();
		   ){
			
			System.out.println("Enter First Value....");
			int firstValue = sc.nextInt();
			System.out.println("Enter Second Value....");
			int secondValue = sc.nextInt();
			
			sum = firstValue/secondValue;
			System.out.println("Addition of Two Numbers::::::" + sum);
			
		}catch(Exception e ) {
			System.out.println("Division-catch::::::::::" + sum);
			e.printStackTrace();
		} finally{
			System.out.println("Inside the finally block");
			
		}
		System.out.println("Division-outer ::::::::::" + sum);
	}
}