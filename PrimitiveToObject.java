
public class PrimitiveToObject {
	
	public static void main(String[] args) {
		
		//Conversion-1: primitive to wrapper class object
		int a = 25;
		double d = 235.687d;
		
		//Explictly doing the boxing
		Integer i = new Integer(a);
		System.out.println("I ==" + i);
		Double d1 = new Double(d);
		System.out.println("d1 = " +d1);
		
		//Implicitly doing the boxing i.e.,Auto boxing
		Integer i1 = a;
		System.out.println("I1 ===" + i1);
		Double d2  = d;
		System.out.println("D2 ====" + d2);
		
		//Calling the Static method using Wrapper class method
		Integer i2 = Integer.valueOf(a);
		Double d3 = Double.valueOf(d);
		System.out.println("I2 ===" + i2);
		System.out.println("d3 ===" + d3);
	}
}