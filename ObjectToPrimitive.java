
public class ObjectToPrimitive {
	
	public static void main(String[] args) {
		
		//1.Using non static method from every wrapper class
		Double d = new Double(25.8945d);
		Double d1 = Double.valueOf(25.6987d);
		//calling non static method
		double finalDouble = d.doubleValue();
		System.out.println("Final Double::::" + finalDouble);
		
		//2.By using AutoUnboxing
		//Integer i = new Integer(25);
		Integer i = Integer.valueOf(58);
		int i1 = i;
		System.out.println("i1====" + i1);
		
		String s = "100";
		System.out.println("s= "+ s);
	
	}
}