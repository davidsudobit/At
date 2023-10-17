package java8PracticeQuestions;

import java.util.StringJoiner;

public class StringPrefixAndSuffix {
	    public static void main(String[] args) {
	        StringJoiner stringJoiner = new StringJoiner(",", "&", "&");
	        stringJoiner.add("One");
	        stringJoiner.add("Two");
	        stringJoiner.add("Three");
	        System.out.println("String after adding # in suffix and prefix :");
	        System.out.println(stringJoiner);
	    }
}
