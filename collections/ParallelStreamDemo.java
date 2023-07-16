package com.ashokit.collections;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
	
	 public static void main(String[] args) {

		 long startTime = System.currentTimeMillis();
		 IntStream.range(1, 10000).forEach(eachNumber -> {System.out.print(eachNumber + " " );});
		 long stopTime = System.currentTimeMillis();
		 System.out.println();
		 System.out.println("Start Time ::::" + startTime);
		 System.out.println("Stop Time ::::" + stopTime);
		 System.out.println("Sequential Stream:::" + (stopTime -startTime));
		 
		 System.out.println("**********************************");
		 startTime = System.currentTimeMillis();
		 IntStream.range(1, 10000).parallel().forEach(eachNumber -> {System.out.print(eachNumber + " ");});
		 stopTime = System.currentTimeMillis();
		 System.out.println();
		 System.out.println("Start Time ::::" + startTime);
		 System.out.println("Stop Time ::::" + stopTime);
		 System.out.println("parallel Stream:::" + (stopTime -startTime));
	}

}
