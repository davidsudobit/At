package Booking;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("ahqym","ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy");
		
		l1.stream().collect(Collectors.<String,String,String>toUnmodifiableMap(Function.identity(),Function.identity(),(value01,value02)->value01)).forEach((key,value)->System.out.println(key+" "+value));
		
		l1.stream().collect(Collectors.mapping(value->value.concat("kl09"), Collectors.toList())).forEach(System.out::println);
		
		l1.stream().collect(Collectors.groupingBy(Function.<String>identity(), LinkedHashMap::new, Collectors.<String,List<String>>toCollection(LinkedList<String>::new))).forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
