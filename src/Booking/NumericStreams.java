package Booking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreams {
	
	public static void main(String args[]) {
		
		System.out.println(IntStream.iterate(1, a->a+a).limit(5).sum());
		
//		IntStream.rangeClosed(1, 50).forEach(System.out::println);
		
		List<Integer> l1=IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
		
		l1.stream().sorted(Comparator.reverseOrder()).reduce(Integer::max).ifPresent(System.out::println);
		
	}

}
