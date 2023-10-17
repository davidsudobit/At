package com.atone;

import java.util.*;

public class NewOne {
	
	static Map<Character,Integer> h1=new HashMap<>();
	
	public static void main(String args[]) {
		
		Scanner scanf=new Scanner(System.in);
		h1.put('I', 1);
		h1.put('V',5);
		h1.put('X', 10);
		h1.put('L', 50);
		h1.put('C', 100);
		h1.put('D', 500);
		h1.put('M', 1000);
		String str=scanf.nextLine();
		System.out.println(NewOne.calculate(str));
	}
	
	public static int calculate(String str) {
		int sum=0;
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='I'&&i+1!=arr.length) {
				if(arr[i+1]=='V'||arr[i+1]=='X') {
					sum+=arr[i+1]=='V'?4:9;
					++i;
				}
				else {
					sum+=h1.get(arr[i]);
				}
			}
			else if(arr[i]=='X'&&i+1!=arr.length) {
				if(arr[i+1]=='L'||arr[i+1]=='C') {
					sum+=arr[i+1]=='L'?40:90;
					++i;
				}
				else {
					sum+=h1.get(arr[i]);
				}
			}
			else if(arr[i]=='C'&&i+1!=arr.length) {
				if(arr[i+1]=='D'||arr[i+1]=='M') {
					sum+=arr[i+1]=='D'?400:900;
					++i;
				}
				else {
					sum+=h1.get(arr[i]);
				}
			}
			else {
				sum+=h1.get(arr[i]);
			}
		}
		return sum;
	}
}
