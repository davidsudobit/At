package com.atone;

import java.util.*;

public class TestString {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		scanf.nextLine();
		for(int i=0;i<n;i++) {
			String str=scanf.nextLine();
			if(str.isEmpty()) {
				System.out.println("one");
			}
		}
	}
}
