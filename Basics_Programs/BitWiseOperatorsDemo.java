class BitWiseOperatorsDemo 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 25;

        System.out.println("Bitwise AND ::::::" + (a & b));

		System.out.println("Bitwise OR ::::::" + (a | b));

		System.out.println("Bitwise XOR ::::::" + (a ^ b));

		System.out.println("Bitwise Complement:::::::" + (~42)); //-43

		System.out.println("Bitwise Left Shift Operators:::::::" + (20<<3)); //160  >> 20*2^3

		System.out.println("Bitwise Left Shift Operators:::::::" + (60<<5)); //1920

		System.out.println("Bitwise Right Shift Operators:::::::" + (60>>5)); // 60/2^5

		System.out.println("Bitwise Right Shift Operators:::::::" + (13>>>2)); // 60/2^5
	}
}
