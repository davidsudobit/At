package Booking;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapSorter {
	
	public static void main(String args[]) {
		
		HashMap<String,String> h1=new HashMap<>();
		
		for(int i=1;i<=10;i++) {
			
			h1.put("Key"+(10-i), "Value"+(i==10?9:i));
			
		}
		
		//Sorting HashMap by Key
		Map<String,String> m1=h1.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry<String,String>::getKey, Entry<String,String>::getValue,(str01,str02)->String.valueOf(str01),LinkedHashMap<String,String>::new));
		
		m1.forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();
		
		//Sorting HashMap by Value
		Map<String,String> m2=h1.entrySet().stream().sorted(Entry.<String,String>comparingByValue()).collect(Collectors.toMap(Entry<String,String>::getKey,Entry<String,String>::getValue,(str01,str02)->str01, LinkedHashMap<String,String>::new));
		
		m2.forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();
		
		//Sorting HashMap by Key using TreeMap
		TreeMap<String,String> treeMap=new TreeMap<>(Comparator.<String,String>comparing(Function.identity()).reversed());
		treeMap.putAll(m1);
		treeMap.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
