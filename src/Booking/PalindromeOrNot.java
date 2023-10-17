package Booking;

import java.util.*;

public class PalindromeOrNot {
	
	public static long reversed=0;
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			long n=scanf.nextLong();
			long toReverse=n;
			
			reverse(toReverse);
			System.out.println(reversed==n);
			
		}
		
	}
	
	public static void reverse(long toReverse) {
		
		if(toReverse>0) {
			
			long r=toReverse%10;
			reversed=reversed*10+r;
			reverse(toReverse/10);
			
		}
		
	}

}
