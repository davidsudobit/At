package com.atone;

import java.util.*;

public class UniqueArray {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		Set<Integer> s=new HashSet<>();
		int i=0;
		while(i<n) {
			s.add(scanf.nextInt());
			i++;
		}
		
		for(int k:s) {
			System.out.print(k);
		}
	}
}
