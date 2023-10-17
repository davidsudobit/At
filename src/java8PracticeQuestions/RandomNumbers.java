package java8PracticeQuestions;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String args[]) {
		
		new Random().ints(10, 1000, 2000).forEach(System.out::println);
		
	}

}
