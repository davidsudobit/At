package Booking;

import java.util.*;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int m=scanf.nextInt();
			
//			n=n+m;
//			m=n-m;
//			n=n-m;
			
			m=n+m;
			n=m-n;
			m=m-n;
			
			System.out.println(n+" "+m);
			
		}
		
	}

}
