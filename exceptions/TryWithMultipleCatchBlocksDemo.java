package exceptions;

import java.util.Scanner;

public class TryWithMultipleCatchBlocksDemo {
	
	public static void main(String[] args) {
		
		System.out.println("********Program Starts Here*********");
		//creating scanner object for collecting inputs from keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value");
		int first  = sc.nextInt();
		
		System.out.println("Enter Second Value");
		int second = sc.nextInt();
		
		//Defining the division logic
		float division=0;
		String st = "Welcome To Ashok IT";
		int arr[] = {10,20,30,40,50};
		
		try {
			division = first/second;
			st.substring(10, 11);
			int arrValue = arr[40];
			Integer.parseInt("10");
		}catch(ArithmeticException | StringIndexOutOfBoundsException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			//Handling the Exception
			System.out.println("Inside the Exception Block....");
		}
		System.out.println("Division Result:::::" + division);
		System.out.println("********Program Ends Here*********");
	}
}