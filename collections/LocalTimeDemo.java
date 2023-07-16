package com.ashokit.collections;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
	
	public static void main(String[] args) {
		
		//Displaying the Times
		LocalTime currTime = LocalTime.now();
		LocalTime t1 = LocalTime.of(5, 32, 44);
		LocalTime t2 = LocalTime.parse("06:32:44");
		
		System.out.println(currTime);
		System.out.println(t1);
		System.out.println(t2);
		
		//plus & Minus methods
		LocalTime t11 = LocalTime.of(5, 32, 44);
		LocalTime t21 = t1.plusHours(2); //minusHours
		LocalTime t31 = t1.minusMinutes(10); //plusMinutes
		
		System.out.println(t11);
		System.out.println(t21);
		System.out.println(t31);
		
		//plus & minus using ChronoUnit
		LocalTime t111 = LocalTime.of(5, 32, 44);
		LocalTime t211 = t1.plus(2, ChronoUnit.HOURS);
		LocalTime t311 = t1.plus(10, ChronoUnit.MINUTES);
		
		System.out.println(t111);
		System.out.println(t211);
		System.out.println(t311);
		
		//Getter Methods from LocalTime Class
		LocalTime t = LocalTime.of(5, 32, 44);
		int hours = t.getHour();
		int minutes = t.getMinute();
		int seconds = t.getSecond();
		
		System.out.println("Time: " + t);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}

}
