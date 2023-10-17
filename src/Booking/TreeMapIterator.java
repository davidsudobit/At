package Booking;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapIterator {
	
	public static void main(String args[]) {
		
		TreeMap<String,String> tm1=new TreeMap<>(Comparator.naturalOrder());
		
		for(int i=1;i<=10;i++) {
			tm1.put("Key"+(10-i), "Value"+i);
		}
		
		Iterator<Entry<String,String>> it01=tm1.entrySet().iterator();
		
		while(it01.hasNext()) {
			Entry<String,String> entry=it01.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
