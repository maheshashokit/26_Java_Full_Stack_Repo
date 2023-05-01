
public class StringTest {

	public static void main(String[] args) {
		
		//String objects
		String st  = new String("Mahesh");
		String st1 = new String("Mahesh1");
		
		st = st.concat("Welcome");
		if(st == st1) {
			System.out.println("Both Are Same....");
		}else {
			System.out.println("Both Are not Same....." + st +"----" + st1);
		}
		
		if(st.equals(st1)) {
			System.out.println("Both are Same");
		}else {
			System.out.println("Both are not same....");
		}
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(15);		
		if(i1 == i2) {
			System.out.println("Both are Same");
		}else {
			System.out.println("Both are not same");
		}
		
		//String literal
		String name="Suresh";
		String firstName="Suresh";
		if(name == firstName) {
			System.out.println("Both are Equal in hashcodes");
		}else {
			System.out.println("Both are not equal in hashcodes");
		}
	}
}