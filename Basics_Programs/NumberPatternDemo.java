class NumberPatternDemo
{
	public static void main(String[] args) 
	{
		//no of lines to be printed
		int noOfLinesPrinting = 10;

		//Iterating the loop based on no of lines to be printing
		//outer for loop is for no of lines representation
		for(int i = 1; i<=noOfLinesPrinting ; i++){

            //inner for loop is for displaying * symbole in a line
            for(int j = 1 ; j<=i ; j++){	
				System.out.print(j + " "); //printing the * based on line number			   
			}
			System.out.println();//moving the cursor to new line 
		}
	}
}
