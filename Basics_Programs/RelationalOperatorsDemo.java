class RelationalOperatorsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Relational Operators Demo");

		int a = 30, b = 20;

		System.out.println("Greater than operator          :::::::::" + (a > b)); //true
		
		System.out.println("Less than operator             :::::::::" + (a < b)); //false
		
		System.out.println("Greater than Equal To operator :::::::::" + (a >= b));//true
		
		System.out.println("Less than Equal To operator    :::::::::" + (a <= b)); //false
		 
		System.out.println("Equal To operator              :::::::::" + (a == b)); //false
		
		System.out.println("Not Equal To operator          :::::::::" + (a != b)); //true

		System.out.println((250 >150) +"----"+ (500<1500) + "----" + (500>1500)+"---"+ (500 ==500) +"----" + (500 !=900));

	}
}
