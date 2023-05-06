import java.util.Scanner;

//This Example demonstrates how to read values into Array from keyboard and displaying values from Array.....
public class ReadAndDisplayArray {

	public static void main(String[] args) {
		
		//Creating the Scanner class object
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No Of Elements For Storing into Array");
		int NoOfElements = sc.nextInt(); //5
		
		//Declaring and Defining second type of one Dimensional Array
		int marks[] = new int[NoOfElements];
		
		//Reading the values into Array
		System.out.println("Length of Array ::::: "+ marks.length);
		for(int i = 0 ; i<marks.length ; i++) {
			//Storing the current value into Array Position
			System.out.println("Enter Element for Array Position  marks["+i+"]");
			marks[i] = sc.nextInt();//taking integer input from user through keyboard
		}
		
		//Displaying the values from Array
		System.out.println("Displaying Array of Values.......");
		//Displaying the Array of Values
		for(int i =0; i<marks.length; i++) {
			System.out.println("marks["+i+"]==>" + marks[i]);
		}
		
		if(sc != null) sc.close();		
	}
}