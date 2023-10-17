package java8PracticeQuestions;

import java.util.StringJoiner;

public class StringJoinerTester {
	
	public static void main(String args[]) {
		
		StringJoiner builder=new StringJoiner("/","PREFIX - "," - SUFFIX");
		
		builder.add("One");
		builder.add("Two");
		builder.add("Three");
		
		System.out.println(builder.toString());
		
	}

}
