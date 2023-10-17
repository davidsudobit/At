package com.JavaAllAtOnce;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryFunctionRunner {
	
	public static void main(String args[]) {
		
		Function<Long,String> f01=(a)->{
			
			return String.valueOf(a);
			
		};
		
		f01.<String>compose((a)->Long.valueOf(a)).<Integer>compose((a)->String.valueOf(a)).apply(1);

		Function<String,String> f02=new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				
				return t+" modified";
				
			}
			
		};
		
	}

}
