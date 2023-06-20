package exceptions;

import java.util.Scanner;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		
		System.out.println("********Program Starts Here*********");
		//creating scanner object for collecting inputs from keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value");
		int first  = sc.nextInt();//25
		
		System.out.println("Enter Second Value");
		int second = sc.nextInt();//0
		
		//Defining the division logic
		float division=0;
		String st = "Welcome To Ashok IT";
		int arr[] = {10,20,30,40,50};
		int arrValue = 0;
		try {
			division = first/second;
			st.substring(10, 11);
			arrValue = arr[4];
			Integer.parseInt("10");
		}catch(ArithmeticException | StringIndexOutOfBoundsException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			//Handling the Exception
			System.out.println("Inside the Exception Block....");
		}finally {
			System.out.println("Finally Block executed......");
			if(sc != null) sc.close();	
		}
		System.out.println("Division Result:::::" + division);
		System.out.println("Accessing Array Element:::::" + arrValue);
		System.out.println("********Program Ends Here*********");
	}
}
