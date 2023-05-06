class IncrementAndDecrementOperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a  = 68;
		System.out.println("First Time Pre-Increment ::::" + (++a)); //69
		System.out.println("Second Time Pre-Increment ::::" + (++a)); //70
		System.out.println("Value of  ::::" + a); //70

		System.out.println("First  Time Post-Increment:::::" + (a++));//70
		System.out.println("Second Time Post-Increment:::::" + (a++));//71
		System.out.println("Third Time Pre-Increment ::::" + (++a));//73

		System.out.println("Demo Expressions ::::" + (++a + a++)); //148

		System.out.println("Demo Expressions ::::" + (a++ + a++)); //151

		System.out.println("After Completion of Increment Operators::::" + a);//77

		//System.out.println("Demo expression :::::" + (a+++++a));// compile time

		System.out.println("===================================================================");
	    
		System.out.println("Pre-Decrement Operator::::::" +(--a)); //76
		System.out.println("Pre-Decrement Operator::::::" +(--a)); //75

		System.out.println("Post-Decrement Operator::::::" +(a--));//75 >>>>  74
		System.out.println("Post-Decrement Operator::::::" +(a--));//74 >>>>  73

		System.out.println("Final Value performing decrement operators:::::" + a);//73

		System.out.println("Demo expression :::::" + (a-- - --a));//2
		//System.out.println("Demo expression :::::" + ((a--)-(--a)));// compile time
		System.out.println("Demo expression :::::" + (a-- + --a));//140  >>> 69
		System.out.println("Demo expression :::::" + (a-- - a--));//1
	}
}

/*

OUTPUT
======
First Time Pre-Increment ::::69
Second Time Pre-Increment ::::70
Value of  ::::70
First  Time Post-Increment:::::70
Second Time Post-Increment:::::71
Third Time Pre-Increment ::::73
Demo Expressions ::::148
Demo Expressions ::::151
After Completion of Increment Operators::::77
Demo expression :::::156
===================================================================
Pre-Decrement Operator::::::78
Pre-Decrement Operator::::::77
Post-Decrement Operator::::::77
Post-Decrement Operator::::::76
Final Value performing decrement operators:::::75
Demo expression :::::2
Demo expression :::::2
Demo expression :::::140
Demo expression :::::1

*/