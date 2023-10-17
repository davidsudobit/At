package Booking;

import java.util.Scanner;

public class StringReverser {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine();
			
			System.out.println(new StringBuilder(str).reverse().toString());
			
		}
		
	}

}
