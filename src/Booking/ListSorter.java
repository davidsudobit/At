package Booking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListSorter {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("ahqym","ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy");
		
		l1.sort(Comparator.comparing(Function.<String>identity()).reversed());
		
		l1.stream().sorted(Comparator.comparing(Function.<String>identity()).reversed()).forEach(System.out::println);
		
	}

}
