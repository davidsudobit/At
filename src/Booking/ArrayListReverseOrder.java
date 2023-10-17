package Booking;

import java.util.*;

public class ArrayListReverseOrder {
	
	public static void main(String args[]) {
		
		List<String> l1=new ArrayList<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy"));
		
		l1.sort(Comparator.comparing(String::valueOf).reversed());
		
		System.out.println(l1);
		
		List<String> l2=new ArrayList<>();
		l2.addAll(l1);
		l2.sort(Comparator.naturalOrder());
		
		Collections.sort(l2,Collections.reverseOrder());
		
		System.out.println("\n"+l2);
		
	}

}
