package com.atone;

import java.util.*;import java.util.stream.Collectors;

public class SampleList{
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		
		List<String> l1=new LinkedList<>();
		l1.add("one");
		l1.add("two");
		List<String> l2=l1.stream().filter(n-> !n.isEmpty()).collect(Collectors.toList());
		
		int n=scanf.nextInt();
		int temp=n,temp01=0;
		
		while(temp>0) {
			int r=temp%10;
			temp/=10;
			temp01+=r;
			if(temp>0) {
				temp01*=10;
			}
		}
		
		System.out.println(temp01);
		
		l2.forEach(System.out::println);
	}
}




