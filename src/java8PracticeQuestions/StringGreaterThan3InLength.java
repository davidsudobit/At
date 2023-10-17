package java8PracticeQuestions;

import java.util.Arrays;

public class StringGreaterThan3InLength {
	
	public static void main(String args[]) {
		
		System.out.println( Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "indian gooseberry", "jujube", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "vanilla", "watermelon", "xigua", "yellow watermelon", "zucchini", "apricot", "blueberry", "coconut", "dragonfruit").
			stream().filter(n->n.length()>3).count() +"\n");
		
		Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "indian gooseberry", "jujube", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "vanilla", "watermelon", "xigua", "yellow watermelon", "zucchini", "apricot", "blueberry", "coconut", "dragonfruit").
				stream().filter(n->n.length()>3).forEach(System.out::println);
		
	}

}
