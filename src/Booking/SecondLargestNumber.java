package Booking;

import java.util.Random;
import java.util.stream.Collectors;

public class SecondLargestNumber {
	
	static int i=0;
	
	public static void main(String args[]) {
		
		int arr[]=new int[30];
		int secondMax=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		
		new Random().ints(30, 23, 78).boxed().collect(Collectors.toList()).forEach((value)->arr[i++]=value.intValue());
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax&&arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		
		System.out.println(secondMax+" "+max);
		
	}

}
