package Booking;

import java.util.*;

public class PowerOfANumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int pow=scanf.nextInt();
			int out=1;
			
			for(int i=0;i<pow;i++) {
				out*=n;
			}
			
			System.out.println(out);
			
			System.out.println(pow(n,pow,1));
			
		}
		
	}
	
	public static int pow(int n,int pow,int count) {
		
		if(count==pow) return n;
		
		return n*pow(n,pow,++count);
		
	}

}
