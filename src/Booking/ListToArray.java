package Booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	
	public static void main(String args[]) {
		
		List<String> l1=new ArrayList<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy"));
		String strArr[]=new String[l1.size()];
		
		l1.toArray(strArr);
		
		for(String str:strArr) {
			System.out.println(str);
		}
		
	}

}
