//Write Java Program to find repeated value from Array (or) Duplicate value from Array
public class DuplicateElementsFromArray {

	public static void main(String[] args) {

		// Harded Code Array Values
		int arr[] = {10, 15, 26, 89, 78, 75, 66, 10, 20, 15,10,15};
		//int [] arr = new int [] {1,2,2,3,3,1,1,2, 7, 8, 8, 3};   
		//int [] arr = new int [] {1, 2, 3, 4, 2, 7, 3, 2, 3,1};   
		// iterating the elements
		int dontRepeatedValue = 0;
		int previousPrintedValue = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j] && previousPrintedValue != arr[j]) && dontRepeatedValue != arr[j]) {
					previousPrintedValue = dontRepeatedValue;
					dontRepeatedValue = arr[j];
					System.out.println(arr[j]);
				}
			}
		}
	}
}