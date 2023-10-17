package javaPracticeQuestions;

import java.util.*;

public class CountOfVowels {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine().toLowerCase();
			int count=0;
			
			for(int i=0;i<str.length();i++) {
				if("aeiou".indexOf(str.charAt(i))!=-1) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
	}

}
