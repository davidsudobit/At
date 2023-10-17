package Booking;

import java.util.*;

public class ReverseANumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int reversedNumber=0;
			
			while(n>0) {
				int r=n%10;
				reversedNumber=reversedNumber*10+r;
				n/=10;
			}
			
			System.out.println(reversedNumber);
			
		}
		
	}

}
