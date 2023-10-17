package Booking;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class CafeSorter {
	
	public static void main(String args[]) {
		
		Stream.of(new CafeShop("Tea",20.12,40L),new CafeShop("Coffee",32.13,50L),new CafeShop("Green Tea",22.89,20L)).sorted(Comparator.<CafeShop,CafeShop>comparing(Function.identity())).forEach(System.out::println);
		
	}

}
