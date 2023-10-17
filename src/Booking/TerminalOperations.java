package Booking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy");
		
		l1.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).ifPresentOrElse(System.out::println, ()->System.out.println("EMPTY"));
		
		Integer integerSum=new Random().ints(30,12,321).boxed().collect(Collectors.summingInt(Integer::valueOf));
		
		System.out.println(integerSum);
		
		Double doubleAvg=new Random().ints(30,12,321).boxed().collect(Collectors.averagingInt(Integer::valueOf));
		
		System.out.println(doubleAvg);
		
		Stream.of("T","A","L","P","B").sequential().forEach(System.out::println);
	}

}
