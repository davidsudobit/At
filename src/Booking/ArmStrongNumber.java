package Booking;

import java.util.*;

public class ArmStrongNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int input=n;
			int sum=0;
			
			while(n>0) {
				int r=n%10;
				sum+=Math.pow(r, 3);
				n/=10;
			}
			
			System.out.println("Is a ArmString number: "+(sum==input));
		}
		
	}

}
