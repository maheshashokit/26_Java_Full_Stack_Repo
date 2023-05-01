
public class PrimitiveToString {
	
	public static void main(String[] args) {
		
		//1 Calling static method from wrapper class
		String value = Integer.toString(25);
		System.out.println("Value:::::" + value);
		//2 wanted to convert the string value into wrapper object
		Integer i1 = Integer.valueOf(value);
		System.out.println("i1 =" + i1);
		//3 extracting the primitive value from wrapper object
		int intValue = i1.intValue();
		System.out.println("int value::::" + intValue);
		
		String value1 = "" + 69;
		System.out.println("Value1::::::" + value1);
	}
}