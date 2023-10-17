package Booking;

import java.util.*;

public class GreatestAmongThreeNumbers {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
		
			int n=scanf.nextInt();
			int m=scanf.nextInt();
			int k=scanf.nextInt();
			
			System.out.println((n>m)?(n>k)?n:(k>m)?k:m:(m>k)?m:k);
			System.out.println((n>m&&n>k)?n:(k>m&&k>n)?k:m);
			
		}
		
	}

}
