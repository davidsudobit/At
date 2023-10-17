package Booking;

import java.util.*;

public class PerfectNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
				
			int sum=0;
				
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum+=i;
				}
				
			}
			
			System.out.println(sum==n);
			
		}
		
	}

}
