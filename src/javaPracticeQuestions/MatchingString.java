package javaPracticeQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatchingString {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str1=scanf.nextLine();
			String str2=scanf.nextLine();
			
			Set<Character> set1=new HashSet<>();
			Set<Character> set2=new HashSet<>();
			
			for(int i=0;i<str1.length();i++) {
				set1.add(str1.charAt(i));
			}
			
			for(int i=0;i<str2.length();i++) {
				set2.add(str2.charAt(i));
			}
			
			Set<Character> set3=new HashSet<>();
			set3.addAll(set1);
			
			set1.retainAll(set2);
			set1.forEach(System.out::println);

			System.out.println();
			
			set3.removeAll(set2);
			set3.forEach(System.out::println);
			
		}
		
	}

}
