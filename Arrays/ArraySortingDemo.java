
public class ArraySortingDemo {
	
	public static void main(String[] args) {
		
		//Sorting Array Elements in Ascending order
		int arr[] = {58,74,14,36,52};
		
		for(int i = 0 ; i <arr.length ; i++) {			
			for(int j = i + 1 ; j <arr.length; j++) {				
				if(arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		
		//For each loop
		for(int currentValue : arr){
			System.out.println(currentValue+ " ");
		}
	}
}