package com.ashokit.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateAndTimeDemo {

	public static void main(String[] args) {

		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime dt1 = LocalDateTime.of(2020, 8, 13, 5, 32);
		LocalDateTime dt2 = LocalDateTime.parse("2020-08-13T05:32");

		System.out.println(currDateTime);
		System.out.println(dt1);
		System.out.println(dt2);
		
		//plus and minus of LocaleDateTime
		LocalDateTime currDateTime1 = LocalDateTime.now();
		LocalDateTime dt11 = currDateTime.plusDays(10);
		LocalDateTime dt21 = currDateTime.minusHours(5);
		
		System.out.println(currDateTime1);
		System.out.println(dt11);
		System.out.println(dt21);
		
	}
}
