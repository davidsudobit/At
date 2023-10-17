package javaPracticeQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurances {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine();
			
			HashMap<Character,Integer> h1=new HashMap<>();
			
			for(int i=0;i<str.length();i++) {
				if(!h1.containsKey(str.charAt(i))) {
					h1.put(str.charAt(i), 1);
				}
				else {
					h1.put(str.charAt(i), h1.get(str.charAt(i))+1);
				}
			}
			
			h1.entrySet().forEach(System.out::println);
			
		}
		
	}

}
