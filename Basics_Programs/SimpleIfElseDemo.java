class SimpleIfElseDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Started ::::: If-Else Demo Program....");

		//Declaring the Variable
		int a = 80;
		String name = "Suresh";
		
		System.out.println(); //empty white line  will be printed
		
		//writing the if statement
		if(name == "Suresh" && a < 150){
		   System.out.println("Inside the If Block........");
		   System.out.println("A value is less than 150 and Name is Suresh");
		}else{
		   System.out.println("Inside the else Block.......");
		   System.out.println("A Value is Greater than 150 or Name is not Suresh");
		}

		System.out.println(); //empty white line  will be printed

		System.out.println("End :::::: If-Else Demo Program.....");
	}
 }