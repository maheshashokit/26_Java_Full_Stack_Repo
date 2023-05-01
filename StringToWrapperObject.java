
public class StringToWrapperObject {

	public static void main(String[] args) {
		
		//1.Converting the String value into wrapper object
		// String >>>>> WrapperObject >>>>> Primitive
		Integer i1 = new Integer("100");
		System.out.println("i1=======" + i1);
		//extract the primitive from wrapper object
		int i2 = i1;//auto unBoxing
		System.out.println("i2====" + i2);
		
		//2.Converting the string value into wrapper object calling static method
		Double i3 = Double.valueOf("65.235d");
		System.out.println("i3 ====" + i3);
		//extract the primitive from wrapper object
		double i4 = i3;//auto unBoxing
		System.out.println("i2====" + i4);
	}
}