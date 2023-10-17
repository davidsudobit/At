package Booking;

import java.util.*;

public class SquareRootOfANumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			
			for(int i=1;(i*i)<=n;i++) {
				
				if(i*i==n) {
					System.out.println(i);
					break;
				}
				
			}
			
			System.out.println(sqrt(1,n));
			sqrt01(1,n);
			
		}
		
	}
	
	public static int sqrt(int i,int n) {
		
		if(i*i>n) return -1;
		
		if(i*i==n) return i;
		
		return sqrt(++i,n);
		
	}
	
	public static void sqrt01(int i,int n) {
		
		if(i*i>n) return;
		
		if(i*i==n) {
			System.out.println(i);
			return;
		}
		
		sqrt01(++i,n);
		
	}

}
