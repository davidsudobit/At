package javaPracticeQuestions;

import java.util.*;

public class NumberOfWordsInAString{
	
	public static void main(String args[]) {
		
		String str="This method accepts a mandatory parameter values which are the elements of the new stream";
		
		String str01[]=str.split(" ");
		
		Map<String,Integer> h1=new HashMap<>();
		
		for(int i=0;i<str01.length;i++) {
			if(h1.containsKey(str01[i])) {
				h1.put(str01[i], h1.get(str01[i])+1);
			}
			else {
				h1.put(str01[i], 1);
			}
		}
		
		h1.entrySet().forEach(System.out::println);
		
	}

}

//abstract class ClassTesting{
//	
//	abstract void test01();
//}
