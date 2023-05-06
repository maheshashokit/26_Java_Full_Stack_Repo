import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		 int arr[] = {50,58,69,47,102};
		 int arr1[] = {50,58,69,47,102};
		
		 boolean arrayEqualFlag = Arrays.equals(arr, arr1);
		 if(arrayEqualFlag) {
			 System.out.println("Both arrays Are Equal....");
		 }else {
			System.out.println("Both arrays are not equal....");
		 }
		 
		 int foundElement = Arrays.binarySearch(arr, 250);  // returning +ve is found -ve is not found
		 System.out.println("Result Of Binary Search::::" + foundElement);
		 int brr[] = Arrays.copyOf(arr, 10);
		 System.out.println("Accessing:::" + brr[3]);
		 Arrays.sort(arr);
		 System.out.println("Printing Array of values as string::::" + Arrays.toString(arr));
		 
		 //Java8 Style for Processing Arrays
		 Arrays.stream(arr).forEach(currentElement  -> System.out.println(currentElement));
		 
		 char[] ch= {'A','S','H','O','K'};
		 String finalValue = Arrays.toString(ch);
		 
		 String st = new String(ch);
		 
		 
		 System.out.println("String value::::" + st);
		 System.out.println("finalValue:::::" + finalValue);
	}
}
