package com.atone;

import java.util.*;
import java.util.function.Consumer;



public class StringReverser {
	
	int a=10;
	
	public static void main(String args[]) {
		
		String str="The string has to be reversed";
		String out="";
		int k=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '||i==str.length()-1) {
				for(int j=(i==str.length()-1)?i:i-1;j>=k;j--) {
					out+=str.charAt(j);
//					System.out.println(str.charAt(j));
				}
				k=i+1;
				out+=" ";
			}
		}
		
		StringReverser sr1=new StringReverser();
		
		Consumer<Integer> c1=StringReverser::printer;
		
		List<Integer> l1=new LinkedList<>();
		l1.stream().forEach(c1);
		
		l1.stream().sorted(Comparator.naturalOrder());
		
//		try {
//			
//			System.out.println(sr1+" "+sr1.clone());
//			
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(out);
	}
	
	public static void printer(int a) {
		System.out.println("int");
	}

}
