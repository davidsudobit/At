package Booking;

import java.io.Console;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListMerge {
	
	public static void main(String args[]) {
		
		List<Integer> l1=new Random().ints(30,20,50).boxed().collect(Collectors.toList());
		
		List<Integer> l2=new Random().ints(30,28,78).boxed().collect(Collectors.toList());
		
		l1.addAll(30, l2);
		
		l1.forEach(System.out::println);
		
		System.out.println(l1.size());
		
	}

}
