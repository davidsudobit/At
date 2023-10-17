package javaPracticeQuestions;

import java.util.*;

public class StringWithOnlyAlphabets {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine();
			
			if(str.matches("^[a-zA-Z]+$")) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(Character.isAlphabetic(str.charAt(i))) {
					count++;
				}
			}
			
			if(count==str.length()) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			
		}
		
	}

}
