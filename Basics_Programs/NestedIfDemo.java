class NestedIfDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start ::::: Nested-If Demo Program.....");

		//Declaring the variables
		int a = 80;
		int b = 20;

		//writing outer if statement
		if(a > b){
		  System.out.println("Start ::::: Outer if Statement is passed....." + a);
		  if(b < 50){
		    System.out.println("Outer,inner if statements got passed::::" +a+ " " + b);
		  }		
	      System.out.println("End ::::: Outer if Statement is passed....." + a);
		}
		System.out.println("End ::::: Nested-If Demo Program.....");
	}
}