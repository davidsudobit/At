package Booking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class HashMapSorterByValue {
	
	public static void main(String args[]) {
		
		Map<Integer,String> m1=new HashMap<>();
		
		Random r1=new Random();
		
		for(int i=0;i<30;i++) {
			
			int key=r1.nextInt(1000);
			int limit=r1.nextInt(10, 45);
			StringBuilder sb=new StringBuilder();
			
			for(int j=0;j<limit;j++) {
				sb.append((char)r1.nextInt(65, 123));
			}
			
			String value=sb.toString();
			
			if(!m1.containsKey(key)) {
				m1.put(key, value);
			}
			else {
				m1.replace(key, value);
			}
			
		}
		
		List<Entry<Integer,String>> l1=new LinkedList<>(m1.entrySet());
		
		System.out.println(l1);
		
		System.out.println();
		
		l1.sort((entry01,entry02)->{
			return entry01.getValue().compareTo(entry02.getValue());
		});
		
		System.out.println(l1);
		
	}

}
