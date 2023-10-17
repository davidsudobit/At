package Booking;

import java.util.*;

public class StringVowelChecker {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine().toLowerCase();
			
			for(int i=0;i<str.length();i++) {
				if("aeiou".indexOf(str.charAt(i))!=-1) {
					System.out.println("Vowels present");
					return;
				}
			}
			
			System.out.println("No vowels present");
			
		}
		
	}

}
