package Booking;

import java.util.*;
import java.util.Map.Entry;

public class ValueAdder{
	
	public static void main(String args[]) {
		
		HashMap<String,String> h1=new HashMap<>();
		h1.put("1", "One");
		h1.put("2", "Two");
		h1.put("3", "Three");
		
		System.out.println(h1+"\n");
		
		System.out.println(h1.size()+"\n");
		
		System.out.println(h1.isEmpty()+"\n");
		
		Iterator<Entry<String,String>> it01=h1.entrySet().iterator();
		
		while(it01.hasNext()) {
			Entry<String,String> out=it01.next();
			System.out.println(out.getKey()+" "+out.getValue());
		}
		
		
	}

}
