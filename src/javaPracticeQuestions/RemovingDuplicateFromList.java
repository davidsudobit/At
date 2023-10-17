package javaPracticeQuestions;

import java.util.*;

public class RemovingDuplicateFromList {
	
	public static void main(String args[]) {
		
		List<String> l1=Arrays.asList("string4", "string7", "string2", "string3", "string8",
                "string2", "string9", "string1", "string0", "string7",
                "string6", "string5", "string1", "string9", "string6",
                "string3", "string8", "string1", "string3", "string2",
                "string5", "string5", "string7", "string8", "string7",
                "string0", "string4", "string4", "string1", "string9",
                "string4", "string2", "string6", "string6", "string8",
                "string3", "string3", "string2", "string8", "string1",
                "string0", "string5", "string7", "string9", "string0",
                "string6", "string5", "string2", "string1", "string9");
		
		Set<String> s1=new HashSet<>();
		
		s1.addAll(l1);
		
		s1.forEach(System.out::println);
		
	}

}
