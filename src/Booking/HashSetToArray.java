package Booking;

import java.util.*;

public class HashSetToArray {
	
	public static void main(String args[]) {
		
		HashSet<String> hashSet=new HashSet<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy"));
		String strArr[]=new String[hashSet.size()];
		
		hashSet.toArray(strArr);
		
		for(String str:strArr) {
			System.out.println(str);
		}
		
	}

}
