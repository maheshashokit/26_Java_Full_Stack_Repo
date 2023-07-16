package com.ashokit.collections;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		// differences between Two dates
		LocalDate d11 = LocalDate.now();
		LocalDate d21 = d11.plusDays(10).plusMonths(5).plusYears(1);

		int days = Period.between(d11, d21).getDays();
		int months = Period.between(d11, d21).getMonths();
		int years = Period.between(d11, d21).getYears();

		System.out.println("Initial Date: " + d11 + " Final Date " + d21);
		System.out.println("Difference in Days: " + days);
		System.out.println("Difference in Months: " + months);
		System.out.println("Difference in Years: " + years);
	}

}
