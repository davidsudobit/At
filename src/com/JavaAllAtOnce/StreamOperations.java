package com.JavaAllAtOnce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {
	
	public static void main(String args[]) {
		
		List<Integer> evens=IntStream.rangeClosed(1, new Random().nextInt(100, 1000)).boxed().collect(Collectors.toCollection(LinkedList<Integer>::new));
		
		/**
		 * @Function Even number filter
		 */
//		evens.stream().filter(value->value%2==0).forEach(System.out::println);
		
		/**
		 * @Function Filters numbers starting with 1
		 */
//		evens.stream().map(value->value.toString()).filter(value->value.startsWith("1")).forEach(System.out::println);
		
		/**
		 * @Function Retrives unique numbers
		 */
//		evens.stream().distinct().forEach(System.out::println);
		
//		evens.stream().
//		collect(Collectors.groupingBy(Function.identity(), LinkedHashMap<Integer, Long>::new,Collectors.counting()))
//		.entrySet().stream()
//		.filter(entry->entry.getValue()==1)
//		.map(entry->entry.getKey())
//		.forEach(System.out::println);
		
		/**
		 * @Function Retrives first element of the list
		 */
//		evens.stream().findFirst().ifPresentOrElse(System.out::println, ()->System.out.println("Nothing inside, tear it"));
		
		/**
		 * @Function Total No.of elements
		 */
//		System.out.println(evens.stream().count());
		
		/**
		 * @Function Max element of all integers
		 */
//		evens.stream().max(Comparator.comparing(Function.identity())).ifPresent(System.out::println);
		
//		System.out.println(evens.stream().reduce(Integer.MIN_VALUE,(value01,value02)->value01.compareTo(value02)>=1?value01:value02));
		
		/**
		 * @Function Find first non-repeating character in string
		 */
//		String.valueOf("THE ONE NEW STRING").chars().mapToObj(value -> (char)value)
//		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//		.entrySet().stream()
//		.filter(entry->entry.getValue()==1)
//		.map(entry->Character.toLowerCase(entry.getKey()))
//		.findFirst()
//		.ifPresent(System.out::println);
		
		/**
		 * @Function StringJoining using stream API
		 */
//		System.out.println(Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada")
//		.stream()
//		.collect(Collectors.joining(", ", "( " , " )")));
		
		/**
		 * @Function IntStream statistics
		 */
//		System.out.println(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
//		.stream()
//		.mapToInt(value->value)
//		.summaryStatistics());
		
		/**
		 * @Function Prime number generator
		 */
//		IntStream.rangeClosed(1, 100).boxed()
//		.filter(value->{
//			
//			if(value<2) return false;
//			
//			for(int j=2;j<value;j++) {
//				
//				if(value%j==0) {
//					
//					return false;
//					
//				}
//				
//			}
//			
//			return true;
//			
//		})
//		.forEach(System.out::println);
		
		/**
		 * @Function Anagram grouping
		 */
//		Arrays.asList("listen", "silent", "hello", "world")
//		.stream()
//		.map(value->{
//			return value.chars().mapToObj(codePoint->(char)codePoint)
//					.sorted(Comparator.naturalOrder())
//					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
//		})
//		.collect(Collectors.groupingBy(Function.identity()))
//		.values()
//		.forEach(System.out::println);
		
		/**
		 * @Function Anagram grouping
		 */
//		Arrays.asList("listen", "silent", "hello", "world").stream()
//		.collect(Collectors.<String,Integer>groupingBy(value->{
//			
//			char stringAsArray[]=value.toCharArray();
//			
//			Arrays.sort(stringAsArray);
//			
//			return String.valueOf(stringAsArray).hashCode();
//			
//		})).values().forEach(System.out::println);
		
		/**
		 * @Function Strings starts with "A" mapped to Uppercase
		 */
//		Arrays.asList(
//	            "Apple", "Banana", "Cat", "Dog", "Elephant",
//	            "Frog", "Giraffe", "Horse", "Iguana", "Jackal",
//	            "Kangaroo", "Lion", "Monkey", "Newt", "Ostrich",
//	            "Peacock", "Quail", "Raccoon", "Snake", "Tiger",
//	            "Umbrella", "Vulture", "Walrus", "X-ray", "Yak", "Zebra",
//	            "Ant", "Albatross", "Alligator", "Bat", "Butterfly",
//	            "Camel", "Cheetah", "Chimpanzee", "Dolphin", "Donkey",
//	            "Eagle", "Fox", "Gazelle", "Gorilla", "Hedgehog",
//	            "Ibis", "Jaguar", "Koala", "Lemur", "Lobster",
//	            "Meerkat", "Nightingale", "Octopus", "Owl", "Penguin",
//	            "Quokka", "Rhinoceros", "Seagull", "Squirrel", "Toucan",
//	            "Uakari", "Viper", "Wombat", "Xiphias", "Yabby", "Zorse",
//	            "Antelope", "Armadillo", "Aardvark", "Anemone", "Avocado",
//	            "Artichoke", "Apricot", "Asparagus", "Almond", "Aloe",
//	            "Amaryllis", "Azalea", "Acacia", "Aconite", "Angelica",
//	            "Aubergine", "Avocet", "Auk", "Antlion", "Aphid",
//	            "Anopheles", "Albacore", "Angelfish", "Anglerfish", "Arapaima",
//	            "Archerfish", "Arowana", "Atlas Moth", "Audi", "Alfa Romeo"
//	        ).stream()
//		.filter(value->value.startsWith("A"))
//		.map(value->value.toUpperCase())
//		.sorted(Comparator.comparing(Function.<String>identity()))
//		.collect(Collectors.toCollection(LinkedList<String>::new))
//		.forEach(System.out::println);
		
		/**
		 * @Function Strings grouping as per the starting letter
		 */
//		Arrays.asList(
//	            "Alice", "Bob", "Charlie", "David", "Eva",
//	            "Frank", "Grace", "Henry", "Ivy", "Jack",
//	            "Kate", "Liam", "Mia", "Noah", "Olivia",
//	            "Peter", "Quinn", "Rachel", "Samuel", "Tina",
//	            "Uma", "Vincent", "Wendy", "Xander", "Yara", "Zane",
//	            "Anna", "Benjamin", "Catherine", "Daniel", "Emily",
//	            "Fiona", "George", "Hannah", "Isaac", "Jessica",
//	            "Kevin", "Lily", "Michael", "Natalie", "Oscar",
//	            "Penelope", "Quincy", "Rebecca", "Simon", "Tara"
//	        ).stream()
//		.collect(Collectors.groupingBy(value->value.charAt(0),LinkedHashMap::new,Collectors.mapping(value->value, Collectors.groupingBy(value->value,LinkedHashMap::new, Collectors.counting()))))
////		.values()
//		.entrySet()
//		.forEach(System.out::println);
		
		/**
		 * @Function Distinct character from the list of Strings
		 */
//		Arrays.asList("Hello", "World", "Java", "Stream").stream()
//		.flatMap(value->value.chars().mapToObj(codePoint->(char)codePoint))
//		.map(value->Character.toLowerCase(value))
//		.distinct()
//		.sorted(Comparator.naturalOrder())
//		.forEach(System.out::println);
		
	}

}
