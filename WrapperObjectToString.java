
public class WrapperObjectToString {

	public static void main(String[] args) {
		
		//creating the any Wrapper class object
		Integer i1 = Integer.valueOf(67);		
		System.out.println("i1 Data:::::" + i1);
	    System.out.println("i1 Data:::::" + i1.toString());
	    
	    Double d1 = Double.valueOf(235897.54d);
	    String st = "" + d1;
	    System.out.println("St=" + st);
	}

}
