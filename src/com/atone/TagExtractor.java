package com.atone;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*;

public class TagExtractor {
	
	public static void main(String args[]) {
		String str=new String("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
		
		Stack<String> stack=new Stack<>();
		
		int open=0;
		int close=0;
		
		System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA).format(40));
		
		List<Integer> l1=new ArrayList<>();
		
		l1.forEach(System.out::println);
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='<') {
				
			}
		}
		
		HashMap<String,String> h1=new HashMap<>();
		
		str.getClass().getName();
		
		BitSet b1=new BitSet(5);
		b1.cardinality();
		
		BigDecimal bd01=new BigDecimal("1.0001");
		BigDecimal bd02=new BigDecimal("1.0002");
		System.out.println(bd01);
		System.out.println(bd01.compareTo(bd02));
		
		BigInteger bi01=new BigInteger("10");
		
//		bi01.mul
		
		Functional f1=System.out::println;
		
		
		try{
			Class class01=Class.forName("String");
			List<Method> l01=new LinkedList<>(Arrays.asList(class01.getDeclaredMethods()));
			l01.forEach((method)->System.out.println(method.getName()));
			class01.getDeclaredMethod("String").setAccessible(false);
			
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	@Override
	public boolean equals(Object t1) {
		return true;
//		return new String();
	}

}

@FunctionalInterface
interface Functional{
	
	public void join(int n);
	
	default void kane() {
	
	}
	
	static void mane() {
		
	}
}
