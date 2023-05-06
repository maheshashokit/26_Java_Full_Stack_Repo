//Write a Java Program to accept some elements into Array and search required element is found or Not Found.
import java.util.Scanner;

public class ArraySearchDemo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Element.....");
		int searchElement =sc.nextInt(); //75
		
		//Harded Code Array Values
		int arr[] = {10,15,26,89,78,75,66};
		
		//Start Iterating the Array and finding searching element
		boolean searchFlag = false;
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] == searchElement) {
				searchFlag = true;
				break;
			}
		}
		
		//checking the flag 
		if(searchFlag) {
			System.out.println("Our Element is Found.....");
		}else {
			System.out.println("Our Element is not Found.....");
		}
		
		//close the scanner class object
		if(sc != null) sc.close();
	}
}
