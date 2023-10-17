package Booking;

import java.util.*;

public class SwitchWithMultipleCases {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
				
			String str=scanf.nextLine();
			
			String out=switch(str.toLowerCase()) {
					
				case "one","two","three"-> {
					yield "Numbers";
				}
				
				default-> {
					yield "Unknown";
				}
				
			};
			
			System.out.println(out);
			
		}
		
	}

}
