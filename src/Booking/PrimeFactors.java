package Booking;

import java.util.*;

public class PrimeFactors {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			int n=scanf.nextInt();
			
			while(n%2==0) {
				System.out.println(2+" ");
				n/=2;
			}
			
			for(int i=3;i<=Math.sqrt(n);i=i+2) {
				while(n%i==0) {
					System.out.println(i+" ");
					n/=i;
				}
			}
			
			if(n>2) {
				System.out.println(n+" ");
			}
			
		}
		
	}

}
