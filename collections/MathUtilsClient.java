package com.ashokit.collections;

import java.util.Arrays;
import java.util.List;

public class MathUtilsClient {
	
	public static void main(String[] args) {
		
		MathUtils<Integer> mathUtils = new MathUtils<>();
		//calling isEquals(Integer num1,Integer num2)
		System.out.println("Integer Comparsion:::" + mathUtils.isEquals(10,10));
		
		MathUtils<Double> mathUtils2 = new MathUtils<>();
		//Calling isEquals(Double num1,Double num2)
		System.out.println("Double Comparsion:::" +mathUtils2.isEquals(12.35d,25.36d));
		
		MathUtils<String> mathUtils3 = new MathUtils<>();
		//Calling isEquals(Double num1,Double num2)
		System.out.println("String comparsion::::"+ mathUtils3.isEquals("Mahesh","Mahesh"));

	}
}