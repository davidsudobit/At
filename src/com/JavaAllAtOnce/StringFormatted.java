package com.JavaAllAtOnce;

import java.text.StringCharacterIterator;
import java.util.Formatter;

public class StringFormatted {
	
	public static void main(String args[]) {
	
		StringFormatted.formattedString(10);
		StringFormatted.stringCharacterIterator();
		
	}
	
	/**
	 * 
	 * @param value
	 * 
	 * @return Formatter instance containing formatted string
	 * 
	 */
	public static Formatter formattedString(Integer value) {
		
		Formatter formatter=new Formatter();
		formatter.format("One is %1$2d", value); /* % {argument index ({number}$)} {flag ( space( ), comma(,), 0, -, +, (, # ) } {width (number)} {precision (number)} d */
		System.out.println(formatter.toString());
		return formatter;
		
	}
	
	public static void stringCharacterIterator() {
		
		StringCharacterIterator stringIterator=new StringCharacterIterator("One is more than two");
		
		char nextChar=stringIterator.current();
		
		do {
			
			System.out.println(nextChar);
			
		}
		while((nextChar=stringIterator.next())!=StringCharacterIterator.DONE);
		
	}

}
