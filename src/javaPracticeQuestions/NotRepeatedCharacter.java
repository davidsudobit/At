package javaPracticeQuestions;

import java.util.*;

public class NotRepeatedCharacter {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine().toLowerCase();
			
			for(int i=0;i<str.length();i++) {
				
				if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
					System.out.println(str.charAt(i));
					break;
				}
				
			}
			
		}
		
	}

}
