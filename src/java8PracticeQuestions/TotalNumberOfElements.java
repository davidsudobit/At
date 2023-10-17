package java8PracticeQuestions;

import java.util.*;

public class TotalNumberOfElements {
	
	public static void main(String args[]) {
		
		List<Integer> l1=Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49);
		
		System.out.println(l1.stream().count());
	}
	
}
