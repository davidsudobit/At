package Booking;

import java.util.Random;
import java.util.stream.Collectors;

public class ArrayShuffler {
	
	static int i=0;
	
	public static void main(String args[]) {
		
		int arr[]=new int[20];
		
		new Random().ints(20,12,67).boxed().collect(Collectors.toList()).forEach((value)->{
			arr[i++]=value;
			System.out.println(value);
		});
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			int changeIndex=new Random().nextInt(20);
			int temp=arr[i];
			arr[i]=arr[changeIndex];
			arr[changeIndex]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
