package Booking;

public class CustomLinkedListRunner {
	
	public static void main(String args[]) {
		
		CustomLinkedList<String> c1=new CustomLinkedList<>();
		
		System.out.println(c1.add("One"));
		System.out.println(c1.add("Two"));
		System.out.println(c1.add("Three"));
		
//		System.out.println(c1.get(2));
		
		System.out.println(c1.size());
		
		System.out.println(c1.toString());
		
		System.out.println(c1.contains("Four"));
		
	}

}
