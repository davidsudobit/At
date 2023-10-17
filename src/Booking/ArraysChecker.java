package Booking;

import java.util.*;

public class ArraysChecker {
	
	public static void main(String args[]){
		
		Integer arr01[]=new Integer[10];
		
		
		for(int i=0;i<10;i++) {
			if(i<5) {
				arr01[i]=i+1;
			}
			else {
				arr01[i]=arr01[9-i];
			}
		}
		
//		Arrays.fill(arr01, 2);
		
		Integer arr02[]=new Integer[5];
		for(int i=0;i<5;i++) {
			arr02[i]=i+1;
		}
		
		Set<Integer> l1=new HashSet<>(Arrays.asList(arr01));
		
		Set<Integer> l2=new LinkedHashSet<>(Arrays.asList(arr02));
		
//		l1.forEach(System.out::println);
//		l2.forEach(System.out::println);
		
		System.out.println(l1.containsAll(l2));
		
	}

}
