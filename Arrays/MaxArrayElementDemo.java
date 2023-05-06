//Writing Java Program to find Maximium & Minimium Value from Array of elements
//Write Java Program to find max & min values from sorting Array
public class MaxArrayElementDemo {
	
	public static void main(String[] args) {
		
		 //Taken an array of static values max value of an Array 130
		 int arr[] = {10,130,90,140,168,987};
		 
		 int max = arr[0];
		 int min = arr[0];
		 //iterating the array of elements for finding max value
		 for(int i = 0 ; i<arr.length ; i++) {			 
			 if(arr[i] > max) {
				 max = arr[i];
			 }
		 }
		 System.out.println("Maximium Value From Array:::::" + max);
		 
		 //iterating the array of elements for finding max value
		 for(int i = 0 ; i<arr.length ; i++) {			 
			 if(arr[i] < min) {
				 min = arr[i];
			 }
		 }
		 System.out.println("Minimium Value From Array:::::" + min);
	}
}