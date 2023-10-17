package Booking;

import java.util.Scanner;

public class SumOfNumbersUsingRecursion {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			System.out.println(sum(n));
			
		}
		
	}
	
	public static int sum(int n) {
		
		if(n>0) {
			
			return n%10+sum(n/10);
			
		}
		
		return 0;
		
	}
	
	public static int sum01(int n) {
		
		if(n==0) return 0;
		
		return (n%10)+sum01(n/10);
		
	}

}
