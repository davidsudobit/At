package com.JavaAllAtOnce;

import java.time.format.DateTimeFormatter;

/**
 * 
 * @author sr73
 * 
 * 
 *
 */
public class InstantTester {
	
	public static void main(String args[]) {
		
//		Instant instant=Instant.MAX;
		
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss").toFormat().format("12-04-1998 12:23:03"));
		
	}

}
