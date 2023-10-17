package Booking;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExamples {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy");
		
		l1.stream().collect(Collectors .groupingBy(Function.identity(),Collectors.toList())).forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();
		
		l1.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.toList())).forEach((key,value)->System.out.println(key+" "+value));
		
		List<Mobile> l2=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			
			String name="Mobile"+i;
			String model="Model"+i;
			Double price=12000.0+i;
			LocalDate date=LocalDate.of(2000+i, 10, 13);
			
			l2.add(new Mobile(name,model,price,date));
			
		}
		
		System.out.println();
		
		l2.stream().collect(Collectors.groupingBy(Mobile::getName,Collectors.maxBy(Comparator.comparing(Mobile::getPrice)))).forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();
		
		l2.stream().collect(Collectors.groupingBy(Mobile::getName,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Mobile::getPrice)),Optional::get))).forEach((key,value)->System.out.println(key+" "+value));
		
		System.out.println();
		
		l2.stream().collect(Collectors.partitioningBy(name->name.getName().startsWith("M"))).forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
