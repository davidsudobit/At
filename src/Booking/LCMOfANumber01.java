package Booking;

import java.util.*;

public class LCMOfANumber01 {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int arr[]=new int[n];
			int out=1;
			int divisor=2;
			
			for(int i=0;i<n;i++) {
				arr[i]=scanf.nextInt();
			}
			
			while(true) {
				int count=0;
				for(int i=0;i<n;i++) {
					if(arr[i]%divisor==0) {
						count++;
						arr[i]/=divisor;
					}
				}
				
				if(count>0) {
					
					out*=divisor;
					
				}
				
				if(count==0) {
					
					if(isPrime(arr)) {
						out*=toOne(arr);
						break;
					}
					divisor++;
				}
				
			}
			
			System.out.println(out);
			
		}
		
	}
	
	public static boolean isPrime(int arr[]) {
		
		int count=0,all=0;
		for(int j=0;j<arr.length;j++) {
			
			for(int i=2;i<arr[j];i++) {
			
				if(arr[j]%i==0) {
					count++;
					return false;
				}
			
			}
		
			if(count==0) {
				all++;
			}
		
		}
		
		if(all==arr.length) {
			return true;
		}
		
		return false;
	}
	
	public static int toOne(int arr[]) {
		
		int out=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				int temp=arr[i];
				for(int j=0;j<arr.length;j++) {
					if(arr[j]%temp==0) {
						arr[j]/=temp;
					}
				}
				out*=temp;
			}
		}
		
		return out;
		
	}

}
