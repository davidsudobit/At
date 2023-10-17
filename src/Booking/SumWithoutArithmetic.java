package Booking;

import java.util.*;

public class SumWithoutArithmetic {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int m=scanf.nextInt();
			
			while(m>0) {
				int temp=n&m;
				n=n^m;
				m=temp<<1;
			}
			
			System.out.println(n);
			
		}
		
	}

}
