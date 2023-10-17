package Booking;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapSorter01 {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> h1=new HashMap<>();
		
		for(int i=1;i<=10;i++) {
			h1.put(i,"value"+String.valueOf(10-(i-1)));
		}
		
		h1.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Function.<Integer>identity()).reversed()))
			.collect(Collectors.toMap(Entry<Integer,String>::getKey,Entry<Integer,String>::getValue, (value01,value02)->value01, LinkedHashMap::new))
			.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
