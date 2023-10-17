package Booking;

import java.util.*;

public class HashSetTraversel {
	
	public static void main(String args[]) {
		
		HashSet<String> hashSet=new HashSet<>(new ArrayList<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy")));
		
		Iterator<String> it01=hashSet.iterator();
		
		while(it01.hasNext()) {
			System.out.println(it01.next());
		}
		
		System.out.println();
		
		hashSet.forEach(System.out::println);
		
	}

}
