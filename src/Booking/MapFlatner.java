package Booking;

import java.util.*;
import java.util.function.Function;

public class MapFlatner {
	
	public static void main(String args[]) {
		
		List<List<String>> l1=Arrays.asList(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd"),Arrays.asList("cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm"),Arrays.asList("elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb"),Arrays.asList("isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb"));
		
		l1.stream().flatMap(List::stream).forEach(System.out::println);;
		
	}

}
