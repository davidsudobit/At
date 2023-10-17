package Booking;

import java.util.*;
import java.util.stream.Collectors;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			List<Integer> l1=(new Random().ints(30, 34, 78).boxed().collect(Collectors.toList()));
			Collections.sort(l1,Comparator.naturalOrder());
			System.out.println(l1);
			
			int arr[]=new int[l1.size()];
			
			for(int i=0;i<l1.size();i++) {
				arr[i]=l1.get(i);
			}
			
			System.out.println( binarySearch(arr,0,l1.size()-1,45));
			
		}
		
	}
	
	public static boolean binarySearch(int arr[],int start,int end,int value) {
		
		int mid=(start+end)/2;
		
		while(start<=end) {
			
			if(arr[mid]==value) {
				return true;
			}
			else if(arr[mid]>value){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
			mid=(start+end)/2;
		}
		
		return false;
		
	}

}
