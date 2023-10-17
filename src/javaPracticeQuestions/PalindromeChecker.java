package javaPracticeQuestions;

import java.util.*;

public class PalindromeChecker {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine().toLowerCase();
			int k=str.length()-1;
			
			for(int i=0;i<str.length()/2;i++) {
				if(str.charAt(i)!=str.charAt(k)) {
					System.out.println("Not a palindrome");
					return;
				}
				k--;
			}
			
			System.out.println("Palindrome");
			
		}
		
	}
}
