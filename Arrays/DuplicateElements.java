
public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,10,10,30,30,10,70};
		int arr1[] = new int[arr.length];
		int arr2[] = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			boolean repeated = false;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				arr1[i] = arr[i];
			}else {
				arr2[i] = arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			boolean found = false;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(arr1[i]);
			}
		}
	}

}
