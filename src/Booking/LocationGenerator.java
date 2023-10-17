package Booking;

import java.util.Random;

public class LocationGenerator {
	
	public static void main(String args[]) {
		
		String latitude="12.97215";
		String longitude="77.71620";
		
		Random latitudeGenerator=new Random();
		Random longitudeGenerator=new Random();
		
		latitude+=latitudeGenerator.nextInt(12, 89);
		
		longitude+=longitudeGenerator.nextInt(32,93);
		
		System.out.println(latitude+"\n"+longitude);
		
		
	}

}
