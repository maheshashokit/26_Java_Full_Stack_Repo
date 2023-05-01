
public class StringToPrimitive {
	
	public static void main(String[] args) {
		
		
		String st = "Mahesh";
		
		//converting the string into primitive
		int value = Integer.parseInt(st);
		double doubleValue = Double.parseDouble(st);
		float parseFloat = Float.parseFloat(st);
		short parseShort = Short.parseShort(st);
		long parseLong = Long.parseLong(st);
		
		
		System.out.println(value+"-----" + doubleValue+"-----"+parseFloat+"-----"+ parseShort+"----"+ parseLong);
	}

}
