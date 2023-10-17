package Booking;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StackClass {
	
	public static void main(String args[]) throws IOException, InstantiationException, IllegalAccessException {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.peek();
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
		pq1.add(2);
		pq1.add(3);
		pq1.add(10);
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
		ByteArrayInputStream b1=new ByteArrayInputStream(new String("The one").getBytes());
		
		byte out[]=new byte[7];
		System.out.println(b1.read(out));
		
		System.out.println(new String(out));
		
		HashMap<String,String> hm1=new HashMap<>();
		for(int i=9;i>=0;i--) {
			hm1.put("Key"+i, "Value"+(10-i));
		}
		
		TreeMap<String, String> tm1=new TreeMap<>(Comparator.comparing(String::valueOf).reversed());
		tm1.putAll(hm1);
		System.out.println(tm1+"\n");
		
		new ArrayList<>(new LinkedList<>(Arrays.asList("One","Two"))).forEach(System.out::println);
		
		LinkedHashMap<String,String> m1=hm1.entrySet().stream().sorted(Map.Entry.<String,String>comparingByKey()).collect(Collectors.toMap(Map.Entry<String,String>::getKey,Map.Entry<String,String>::getValue,(entry01,entry02)->entry01,LinkedHashMap::new));
		
		System.out.println("\n"+m1+"\n");
		
		ArrayList<String> l1=new ArrayList<>(new LinkedList<>(Arrays.asList("One","Two")));
		
		Collections.sort(l1,Comparator.reverseOrder());
		
		l1.sort(Comparator.reverseOrder());
		
		System.out.println(l1+"\n");
	
	}

}
