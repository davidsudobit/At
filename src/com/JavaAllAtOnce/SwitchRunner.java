package com.JavaAllAtOnce;

import java.util.Scanner;

public class SwitchRunner{
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
		
			StringBuilder builder=switch(scanf.nextLine()) {
				
				case "One" -> {
					yield new StringBuilder("One");
				}
				
				case "Two" -> { 
					yield new StringBuilder("Two");
				}
				
				default -> {
					yield new StringBuilder("No Match");
				}
			
			};
			
			SwitchRunner.changeStringBuilder(builder);
			System.out.println(builder.toString());
			
		}
		
	}
	
	public static void changeStringBuilder(StringBuilder stringBuilder) {
		
		stringBuilder.append(" Got Changed");
		
	}

}
