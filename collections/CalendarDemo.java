package com.ashokit.collections;

import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		//Getting Calendar object variable using static factory method
		Calendar c1 = Calendar.getInstance();
		
		String currentDate = getCurrentDateUsingCalendar(c1);
		System.out.println("Current Date :::: " +currentDate);
		
		String currentTime = getCurrentTime(c1);
		System.out.println("Current Time :::::" + currentTime);
	}
	
	public static String getCurrentDateUsingCalendar(Calendar c1) {
		int day = c1.get(Calendar.DAY_OF_MONTH); //11
		int month = c1.get(Calendar.MONTH) + 1;//07
		int year = c1.get(Calendar.YEAR);//2023
		return String.format("%d-%d-%d", day,month,year);
	}
	
	public static String getCurrentTime(Calendar c1) {
		int hours = c1.get(Calendar.HOUR);
		int minutes = c1.get(Calendar.MINUTE);
		int seconds = c1.get(Calendar.SECOND);
		int amOrPm = c1.get(Calendar.AM_PM);
		return String.format("%d:%d:%d %S",hours,minutes,seconds,amOrPm == 0 ?"AM" :"PM");
	}
}
