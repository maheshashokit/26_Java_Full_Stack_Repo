package com.ashokit.collections;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		
		//Populating the current Date value 
		LocalDate ld = LocalDate.now();
		System.out.println("Current Date::::" + ld);
		
		//Populating the customized the date value
		LocalDate date = LocalDate.of(2021, 8, 13);
		System.out.println("Custom Date: " + date);
		
		//Date value as string "2022-08-13"(ISO Format)
		LocalDate parseDate = LocalDate.parse("2022-08-22");
		System.out.println("String as Date:::::" + parseDate);
		
		//Formatting the LocalDate object 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String formattedDateValue = parseDate.format(dtf);
		System.out.println("Formatted Date:::::" + formattedDateValue);
		
		//Find the Tomorrows Date & Yesterday Date
		LocalDate currDate = LocalDate.now();
		LocalDate yesterday = currDate.minusDays(1);
		LocalDate tomorrow = currDate.plusDays(1);
		
		System.out.println("Current Date: " + currDate);
		System.out.println("tomorrow's Date: " + tomorrow);
		System.out.println("Yesterday's Date: " + yesterday);
		
		//using plus() and minus() with chronounits
		LocalDate date1 = currDate.plus(5, ChronoUnit.MONTHS);
		LocalDate date2 = currDate.minus(5, ChronoUnit.DAYS);	
		LocalDate date3 = currDate.plus(5, ChronoUnit.YEARS);	
		LocalDate date4 = currDate.minus(5, ChronoUnit.YEARS);	
		
		System.out.println("Current Date: " + currDate);
		System.out.println("Current Date plus five months: " + date1);
		System.out.println("Current Date minus five days: " + date2);
		System.out.println("Current Date plus  five years: " + date3);
		System.out.println("Current Date minus  five years: " + date4);
		
		//Getters Methods from LocalDate Class
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();//getDayOfWeek() returns a DayOfWeek instance and not a String
		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();
		
		System.out.println("Date: " + currDate);
		System.out.println("Day of Week: " + dayOfWeek);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Day of Year: " + dayOfYear);
		
		//comparing the dates
		LocalDate tomorrow1 = currDate.plusDays(1);
		LocalDate yesterday1 = currDate.minusDays(1);
		
		System.out.println("Current date is after yesterday's date: " + currDate.isAfter(yesterday1));
		System.out.println("Current date is before tomorrow's date: " + currDate.isBefore(tomorrow1));
	}
}
