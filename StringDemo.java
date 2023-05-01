
public class StringDemo {
	
	public static void main(String[] args) {
		
		String str  = "Welcome To Ashok IT";
		
		//wanted to find the string of Ashok IT
		String substring = str.substring(11);
		System.out.println(substring);
		
		System.out.println("Last index::::" + str.indexOf("Ashok"));
		String substring1 = str.substring(str.indexOf("Ashok"));
		System.out.println("Substring with Single Parameters:::" + substring1);		
		System.out.println("SubString with two Parameters:::::" +str.substring(str.indexOf("Ashok"),str.lastIndexOf("T") +1));
		
		//converting the String into charArray
		char[] chars = str.toCharArray();		
		for(int i = 0 ; i<chars.length ; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		//constructing the string dynamically
		String st = "Good Morning User %s";
		System.out.println(String.format(st, "Mahesh"));
		
		String st1 = "Welcome To Ashok IT %s and Username is %s";
		System.out.println(String.format(st1, "Hyderabad","Mahesh"));
		
		//equals method
		String message = "Hyderabad";
		String message1 ="hyderabad";
		
		if(message ==  message1) {
			System.out.println("Both are Equal");
		}else {
		    System.out.println("Both are not Equal");
		}
		
		//comparing the string with equals method i.e.,case sensitive
		if(message.equalsIgnoreCase(message1)) {
			System.out.println("Both are Equally");
		}else {
			System.out.println("Both are not Equally");
		}	
		
		String replacedString = message.replaceAll("a", "XY");
		System.out.println("Replaced String::::" + replacedString);
	}
}
