package com.JavaAllAtOnce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSorter {
	
	public static void main(String args[]) {
		
		Map<Integer,String> m1=MapGenerator.generate();
		
//		m1.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Function.<Integer>identity()).reversed())).forEach(System.out::println);
		
		List<String> l1=Arrays.asList("listen", "silent", "hello", "world");
		
//		l1.stream().collect(Collectors.toMap(value->{
//			
//			char str[]=value.toCharArray();
//			Arrays.sort(str);
//			return String.valueOf(str).hashCode();
//			
//		}, value->value)).entrySet().stream().collect(Collectors.groupingBy(entry->entry.getKey())).entrySet().forEach(System.out::println);;
		
		l1.stream().collect(Collectors.groupingBy(value->{
			
			char str[]=value.toCharArray();
			
			Arrays.sort(str);
			
			return String.valueOf(str).hashCode();
			
		})).entrySet().stream().map(entry->entry.getValue()).forEach(System.out::println);
		
//		Comparator<Entry<Integer,String>> c1=new Comparator<>() {
//
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				
//				return o1.getKey().compareTo(o2.getKey());
//				
//			}
//			
//		};
		
//		m1.entrySet().stream().sorted(c1.thenComparing(Entry.comparingByValue())).forEach(System.out::println);
		
//		m1.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Function.<Integer>identity()).reversed())).forEach(System.out::println);
//		
//		m1.entrySet().stream().sorted(Entry.comparingByValue(Comparator.comparing(Function.<String>identity()).reversed())).forEach(System.out::println);;
//		
//		m1.entrySet().stream().sorted(Entry.comparingByValue(Comparator.comparing(Function.<String>identity()).reversed())).forEach(System.out::println);
		
	}

}
