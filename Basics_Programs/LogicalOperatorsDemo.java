class LogicalOperatorsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Logical Operators Demo........");

		int a = 30, b = 50;

		System.out.println("Logical AND :::::::" + ((a > b) && (a < b)));//false

		System.out.println("Logical OR  :::::::" + ((a > b) || (a < b)));// True

		System.out.println("Logical NOT :::::::" + (!((a > b) && (a < b))));//true

		System.out.println((!(a || b)));
	}
}
