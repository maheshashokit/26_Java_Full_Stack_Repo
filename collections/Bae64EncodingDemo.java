package com.ashokit.collections;

import java.util.Base64;

public class Bae64EncodingDemo {
	
	public static void main(String[] args) {
		
		//Encoding the Converting Reading strings into Unreadable String
		String encodedString = Base64.getEncoder().encodeToString("AshokITHyderabadAmeerpet".getBytes());
		System.out.println("EnCoded String Mahesh::::" + encodedString);
		
		//Decoding the String
		byte[] decode = Base64.getDecoder().decode(encodedString);
		//converting the byte[] into Readable Strings
		String st = new String(decode);
		System.out.println("Decoded String::::" + st);
		System.out.println("Decoded String::::" + new String(decode));
		
		
		
	}

}
