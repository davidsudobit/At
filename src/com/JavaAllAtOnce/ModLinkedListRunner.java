package com.JavaAllAtOnce;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ModLinkedListRunner {
	
	public static void main(String args[]) {
		
		ModLinkedList<Integer> l1=new ModLinkedList<>();
		
//		for(int i=0;i<10;i++) {
//			l1.add(i);
//		}
//		
//		l1.addFirst(10);
//		l1.addLast(11);
//		
//		System.out.println(l1.get(0));
//		System.out.println(l1.get(l1.size()-1));
//		
//		l1.addLast(20);
//		
//		System.out.println(l1.get(l1.size()-1));
//		
//		System.out.println(l1.contains(0));
//		
//		System.out.println(l1.contains(21));
		
		l1.addFirst(10);
		
		System.out.println(l1.get(0));
		
		l1.addFirst(11);
		
		System.out.println(l1.get(0));
		
		l1.addFirst(12);
		
		System.out.println(l1.get(0));
		
		l1.stream().sorted(Comparator.naturalOrder()).findFirst().ifPresent(System.out::println);
		
		List<Integer> l2=new LinkedList<>();
		
		Set<Integer> s1=new HashSet<>();
		
		String string01=new String("One");
		
		String string02=new String("One");
		
		String string03=new String("Two").intern();
		
		String string04="Two";
		
		System.out.println(string01==string02);
		
		System.out.println(string03==string04);
		
	}
}
