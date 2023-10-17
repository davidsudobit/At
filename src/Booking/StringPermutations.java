package Booking;

import java.util.*;

public class StringPermutations {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str=scanf.nextLine();
			char[] forCheck=str.toCharArray();
			int count=0;
			Set<String> strSet=new HashSet<>();
			
//			while(!forCheck.equals(str)||count==0) {
//				String remaining=forCheck.substring(1);
//				remaining+=forCheck.charAt(0);
//				forCheck=remaining;
//				System.out.println(forCheck);
//				count++;
//			}
			
			for(int i=0;i<forCheck.length;i++) {
				for(int j=0;j<forCheck.length;j++) {
					char temp=forCheck[i];
					forCheck[i]=forCheck[j];
					forCheck[j]=temp;
					
					strSet.add(new String(forCheck));
					forCheck=str.toCharArray();
				}
			}
			
			System.out.println(strSet);
			
			double a=20.0;
			double b=20.0;
			
			System.out.println(a==b);
			
		}
		
	}

}
