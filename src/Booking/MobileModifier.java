package Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class MobileModifier {
	
	public static void main(String args[]) {
		
		List<Mobile> l1=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			
			String name="Mobile"+i;
			String model="Model"+i;
			Double price=12000.0+i;
			LocalDate date=LocalDate.of(2000+i, 10, 13);
			
			l1.add(new Mobile(name,model,price,date));
			
		}
		
//		l1.sort(Comparator.comparing(Mobile::getManufacturingDate).reversed());
		
//		l1.forEach(System.out::println);
		
//		l1.stream().sorted(Comparator.comparing(Mobile::getManufacturingDate, (date01,date02)->date02.compareTo(date01))).forEach(System.out::println);   Reversing the order of date using the key comparator
		
		l1.stream().sorted(Comparator.comparing(Mobile::getManufacturingDate).reversed()).forEach(System.out::println);
		
		TreeSet t1=new TreeSet();
		HashSet h1=new HashSet();
		
		t1.add(new Student(""));
		
		for(int i=1;i<=10;i++) {
			
			String name="Mobile"+i;
			String model="Model"+i;
			Double price=12000.0+i;
			LocalDate date=LocalDate.of(2000+i, 10, 13);
			
			t1.add(new Mobile(name,model,price,date));
			h1.add(new Mobile(name,model,price,date));
			
		}
		
		
		h1.add(new Student(""));
		
		h1.forEach(System.out::println);
//		t1.forEach(System.out::println);
		
	}

}
