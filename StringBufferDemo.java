import java.util.Date;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer emailContent = new StringBuffer();
		
		System.out.println("Capacity ::::" + emailContent.capacity());
		emailContent.append("Good Morning Mahesh,");
		emailContent.append("\n\nYour Account is Expiring soon on Today::::" + new Date());
		emailContent.append("\n\nThanks & Regards,");
		emailContent.append("\nAshok IT Admin.");
		System.out.println("Length  :::::" + emailContent.length());
		System.out.println("Capacity ::::" + emailContent.capacity());
		System.out.println(emailContent);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Welcome To Mahesh");
		System.out.println("Before Performing::::" + sb1);
		System.out.println("Reverse Before Performing::::" + sb1.reverse());
		sb1.insert(2, "CoreJava");
		System.out.println("StringBuffer Object:::::" + sb1);
		
		String finalValue = sb1.toString();
		System.out.println("Final Value::::" + finalValue);
	}

}
