package com.atone;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test01 {
	public static void main(String args[]) {
		List<Integer> l1=new ArrayList(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
//		Map<Integer,Long> m1=l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(m1);
		
//		int n=l1.stream().max((n1,n2)->n1.compareTo(n2)).get();
		int n=l1.stream().mapToInt(n1->n1).sum();
		System.out.println(n);
		
		String str[]=new String[1];
		System.out.println(str[0]);
		Optional<String> opt=Optional.of(str[0]);
	}
}
