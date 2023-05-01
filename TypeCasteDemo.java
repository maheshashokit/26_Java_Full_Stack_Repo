
public class TypeCasteDemo {
	
	public static void main(String[] args) {
		
		//widening
		short sh1 = 30687;
		long d = sh1;//lower to higher
		System.out.println("d=" + d);
		System.out.println("sh1=" + sh1);
		
		//narrowing
		int a = 80000;		
		short sh = (short)a;
		System.out.println("sh ====" + sh);
		
	}

}
