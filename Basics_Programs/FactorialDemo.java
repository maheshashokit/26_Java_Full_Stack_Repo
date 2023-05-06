class FactorialDemo 
{
	public static void main(String[] args) 
	{
		//Finding factorial of below number
		int factorialNumber = 6;

		//Required Loop of Multiplying factorials
		int loopStart = 1;

		//condition for loop
		int factorialValue = 1;
		while(loopStart <= factorialNumber){ // 1    5  // 2 5  // 3 5
		 
		   factorialValue =  factorialValue * loopStart;  // 1*1  // 1 * 2  //  2*3 // 6*4 // 24*5

           //updating the loop variable
		   loopStart++; //5
		}

		System.out.println("Factorial Of Given Number:::::" + factorialNumber + " is  " + factorialValue);

	}
}
