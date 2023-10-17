package java8PracticeQuestions;

import java.util.*;

public class IntegerStartingWithOne {
	
	public static void main(String args[]) {
		
		List<Integer> l1=Arrays.asList(10,20,30,40,100,200,419,110);
		
		long count=l1.stream().map(String::valueOf).filter(n->n.startsWith("1")).peek(System.out::println).count();
		
		System.out.println("\nCount: "+count);
	}

}
