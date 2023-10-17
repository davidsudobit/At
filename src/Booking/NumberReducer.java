package Booking;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberReducer {
	
	public static void main(String args[]) {
		
		List<Integer> l1=new Random().ints(20,1,150).boxed().collect(Collectors.toList());
		
		Integer reducedInteger= l1.stream().reduce(0,(value01,value02)->value01+value02);
		
		System.out.println(reducedInteger);
		
		String reduced=l1.stream().reduce("Reduced, ", (stringValue,integerValue)->stringValue.concat(integerValue.toString()+", "), (value01,value02)->value01);
		
		System.out.println(reduced);
		
		l1.forEach(System.out::println);
		
		int sumOfTheList=l1.stream().mapToInt(Integer::valueOf).sum();
		
		System.out.println(sumOfTheList);
		
	}

}
