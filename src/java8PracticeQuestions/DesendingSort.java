package java8PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesendingSort {
	
	static int n=0;

	public static void main(String args[]) {
		
		List<Integer> l1=Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 88);
		List<Integer> l2=Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 89);
		
		l1.stream(). /* or */
				sorted(Comparator.<Integer,Integer>comparing(n->n).reversed()).forEach(System.out::println);
		
		Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(n->n.getValue()>1).map(n->n.getKey()).forEach(System.out::println);
		
		long count=l1.stream().collect(Collectors.summingInt((a)->a));
		
		OptionalInt count01=l1.stream().mapToInt(Integer::valueOf).max();
		
		l1.stream().min(Integer::sum);
		
		new Random().ints().limit(10);
		
		List<List<Integer>> l3=new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		
		System.out.println();
		l3.stream().flatMap(n->n.stream()).collect(Collectors.toList()).forEach(System.out::println);
		
//		System.out.println("new//");
//		Stream.of(l1,l2).flatMap(n->n.stream()).forEach(System.out::println);
		count01.ifPresent(System.out::println);
	}
}
