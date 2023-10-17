package com.atone;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDuplicateRemover {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("crisis","Elephant","cirsis","Malayalam").stream().map(string->{
			return string.toLowerCase().chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(a->a, Collectors.counting())).entrySet().stream().map(entry->entry.getKey()).reduce("", (a,b)-> String.valueOf(a).concat(String.valueOf(b)),(a,b)->a+b);
		}).collect(Collectors.toList());
		
		Arrays.asList("crisis","Elephant","cirsis","Malayalam").stream().sorted(Comparator.comparing(str->((String)str).charAt(2))).forEach(System.out::println);
		
		l1.iterator().forEachRemaining((str)->System.out.println(str));
		
		Map<String,List<String>> m1=Stream.of("crisis","Elephant","Malayalam").collect(Collectors.groupingBy(String::valueOf));
		System.out.println(m1);
		
		System.out.println( Arrays.stream(new String[]{"crisis","Elephant","Malayalam"}).noneMatch(str->str.startsWith("v")));
		
		BigInteger bigInteger=BigInteger.valueOf(1);
		
		AbstractClass a1=new AbstractImplementation();
		
		a1.connectToDatabase();
		
		
	}

}

abstract class AbstractClass{
	
	public void connectToDatabase() {
		
	}
	
}

class AbstractImplementation extends AbstractClass{
	
}

interface NewInterface{
	
	public final static int value=1;
	
	private static void main() {
		
	}
	
	public static void main01() {
		main();
	}
	
}

