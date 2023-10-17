package Booking;

import java.util.*;
import java.util.stream.Collectors;

public class Test02 {
	public static void main(String args[]) {
		List<Integer> l1=new ArrayList<>(Arrays.asList(2, 5, 3, 7, 11, 13, 17, 19, 23, 29));
		List<Integer> l2=l1.stream().sorted((n1,n2)-> n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println();
		Collections.sort(l1);
		System.out.println(l1);
		List<String> l3=new ArrayList<>(Arrays.asList("USA", "Japan", "France", "Germany", "Italy","",""));
		l3.stream().filter(s1->s1.length()>3).forEach(System.out::println);
		System.out.println(Collections.disjoint(l1, l2));
	}
}
