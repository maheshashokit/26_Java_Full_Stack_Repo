import java.util.Scanner;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Number Of Student to be stored");
		 int noOfStudents  = sc.nextInt();
		 System.out.println("Enter Number Of Subjects to be stored");
		 int noOfSubjects = sc.nextInt();
		 
		 //creating the two dimensional array
		 int studentMarks[][] = new int[noOfStudents][noOfSubjects];
		 
		 //Storing the values into Two dimensional Array
		 //outer loop for student iteration
		 for(int i = 0 ; i<noOfStudents ; i++) {
			 //inner loop for subjects iterations
			 for(int j =0 ; j<noOfSubjects ; j++) {
				 System.out.println("Enter Array Elements to Store arr[" +i+"]["+j+"]");
				 studentMarks[i][j] = sc.nextInt();
			 }			 
		 }
		 
		 //displaying the values from multi-dimensional Array
		 for(int i = 0 ; i<noOfStudents ; i++) {
			 //inner loop for subjects iterations
			 for(int j =0 ; j<noOfSubjects ; j++) {
				System.out.print(studentMarks[i][j] + " ");
			 }			 
			 System.out.println("");
		 }
		 if(sc != null) sc.close();
	}
}