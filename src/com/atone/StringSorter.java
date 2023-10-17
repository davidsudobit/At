package com.atone;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Locale;

public class StringSorter {
	
	public static void main(String args[]) throws NoSuchAlgorithmException{
			
		String str=new String("programmingy");
		
		String input[]=new String[4];
		
		long max=Long.MAX_VALUE;
		long min=Long.MIN_VALUE;
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
		Locale locale=new Locale("en","IN");
		System.out.println(locale.getClass().getSimpleName());
		
		String str09=new String("HelloWorld");
		MessageDigest md5=MessageDigest.getInstance("MD5");
		byte[] out=md5.digest(str09.getBytes());
		String outHash="";
		for(byte one:out) {
			outHash+=String.format("%02x",one);
		}
		System.out.println(outHash);
		
		String message=new String("He is a very very good boy, isn't he?");
		
		String strarr[]=message.split("\\s+|,\\s*|\\s+|'\\s*|\\.\\s*");
		System.out.println(strarr.length);
		for(String one:strarr) {
			System.out.println(one);
		}
		
		int l=0;
		
		for(int i=0;i<12;i=i+3) {
			input[l++]=str.substring(i, i+3);
		}
		
		for(int i=0;i<3;i++) {
			for(int j=i;j<4;j++) {
				if(input[i].compareTo(input[j])>=1) {
					String temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
				
//				System.out.println(input[i].compareTo(input[j]));
			}
		}
		
		for(String str01:input) {
			System.out.println(str01);
		}
	}
}
