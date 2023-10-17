package com.JavaAllAtOnce;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateAndTimePrinter {
	
	public static void main(String args[]) {
		
		System.out.println(DateAndTimePrinter.localDateParser("12-12-2012", "MM-dd-yyyy"));
		
	}
	
	public static String localDateParser(String date, String pattern) {
		
		return LocalDate.parse(date, new DateTimeFormatterBuilder().appendPattern(pattern).toFormatter()).format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		
	}

}
