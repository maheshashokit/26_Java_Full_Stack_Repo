package com.ashokit.collections;

import java.util.stream.IntStream;

public class ParallelStreamDemo1 {
	
	public static void main(String[] args) {
		
		 
		 long startTime = System.currentTimeMillis();
		 IntStream.range(1, 100000).parallel().forEach(eachNumber -> {System.out.println(eachNumber + " ");});
		 long stopTime = System.currentTimeMillis();
		 System.out.println();
		 System.out.println("parallel Stream:::" + (stopTime -startTime));
		 
	}

}
