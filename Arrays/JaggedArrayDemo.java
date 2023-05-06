
public class JaggedArrayDemo {
	
	public static void main(String[] args) {
		int a1[] = {30,34,35};
		int a2[] = {50,60,70,90};
		int a3[] = {50,60,70,90,100,105};
		
		//Created Jagged Array
		int a4[][] = {a1,a2,a3};
		
		//processing the Jagged Array
		for(int i = 0; i<a4.length; i++) {
			for(int j = 0 ; j< a4[i].length; j++) {
				System.out.print(a4[i][j]+ " ");
			}
		    System.out.println("");
		}
	}
}