package Booking;

import java.util.*;

public class FactorialOfANumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			
			System.out.println(fact(n));
			
		}
		
	}
	
	public static int fact(int n) {
		
		if(n==0) return 1;
		
		return n*fact(n-1);
		
	}

}
