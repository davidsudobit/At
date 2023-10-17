package Booking;

import java.util.*;

public class FibonacciUsingRecursion {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			
			System.out.println();
			
			for(int i=0;i<n;i++) {
				System.out.println(fibonacci(i));
			}
			
			System.out.println();
			
			int a=0,b=1,sum=0;
			
			for(int i=0;i<n-2;i++) {
				
				if(a==0) {
					System.out.println(a+"\n"+b);
				}
				
				System.out.println(sum=a+b);
				a=b;
				b=sum;
				
			}
			
		}
		
	}
	
	public static int fibonacci(int n) {
		
		if(n==0) return 0;
		
		if(n==1) return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
		
	}

}
