package java8PracticeQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class MinAndMax {
	
	public static void main(String args[]) {
		
		IntSummaryStatistics all=Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49).
			stream().mapToInt(n->n).summaryStatistics();
		
		Stream.of(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49)
		.max(Integer::compareTo).ifPresent(System.out::println);
		
		System.out.println(BinaryOperator.<Integer>maxBy(Integer::compareTo).apply(17, 50));
		
		System.out.println("Min = "+all.getMin()+" Max = "+all.getMax());	
		
	}

}
