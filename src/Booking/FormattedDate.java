package Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattedDate {
	
	public static void main(String args[]) {
		
		DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("MMM-dd-yyyy");
		String date=dateFormatter.format(LocalDate.of(1998, 12, 9));
		
		System.out.println(date);
	}

}
