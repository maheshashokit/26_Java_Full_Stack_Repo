//Write Java Program to store some Static values in single dimensional array and accessing elements using
//Array Index based and traditional for loop.
public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//Declaring the Array and Defining Array Values
		//Creating Array as Non-Fixed length
		int marks[] = {50,60,70,80,90,100};
		
		///Creating Array with Fidex length
		int salaries[] = new int[5];
		
		//Accessing the values from Marks Array
		System.out.println("Zeorth Element:::::" + marks[0]);
		System.out.println("First Element::::::" + marks[1]);
		System.out.println("Second Element:::::" + marks[2]);
		System.out.println("Third Element::::::" + marks[3]);
		System.out.println("Fourth Element:::::" + marks[4]);
		System.out.println("Fifth Element::::::" + marks[5]);
		
		System.out.println("**********************************************");
		
		//Accessing Values from Array using Traditional very loop
		//marks[0] >>>> 50,marks[1] =60,marks[2]=70,marks[3]=80,marks[4]=90,marks[5]=100
		for(int i = 0 ; i<marks.length; i++ ) {
			//System.out.println(marks[i]); 			
			System.out.println("marks["+i+"]="+ marks[i]);
		}	
	}
}