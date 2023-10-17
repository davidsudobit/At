package Booking;

import java.util.*;

public class StringSpaceRemover {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine();
			int first=-1;
			int last=-1;
			
			for(int i=0;i<str.length();i++) {
				
				if(!Character.isWhitespace(str.charAt(i))) {
					first=first==-1?i:first;
				}
				
				if(!Character.isWhitespace(str.charAt(str.length()-i-1))) {
					last=last==-1?str.length()-i:last;
				}
				
			}
			
			System.out.println(str.substring(first, last));
			
			String[] strarr= {"One","Two","Three","Four","Five"};
		
			
			Comparator<String> c1=(str01,str02)->{
				if(((Character)str01.charAt(0)).compareTo(str02.charAt(0))==0) {
					return ((Character)str02.charAt(str02.length()-1)).compareTo(str01.charAt(str01.length()-1));
				}
				
				return ((Character)str01.charAt(0)).compareTo(str02.charAt(0));
				
			};
			
			Arrays.sort(strarr,Comparator.comparing(String::valueOf,c1));
			
			for(String temp:strarr) {
				System.out.println(temp);
			}
			
			System.out.println( Arrays.asList("One","Two","Three","Four","Five").spliterator().tryAdvance(System.out::println) );
			List<String> l1=Arrays.asList("One","Two","Three","Four","Five");
			Collections.reverse(l1);
			
			System.out.println(l1);
			
		}
		
	}

}
