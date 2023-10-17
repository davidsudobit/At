package Booking;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicateRemover {
	
	public static void main(String args[]) {
		
		String string="bananabananaananabananaanabanana";
		
		String reduced=string.chars().mapToObj(value->(char)value).distinct().reduce("", (value01,value02)->value01.concat(value02.toString()), (value01,value02)->value01);
		
		string.chars().mapToObj(value->(char)value).collect(Collectors.groupingBy(Function.<Character>identity(),Collectors.counting())).entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		System.out.println(reduced);
		
	}

}
