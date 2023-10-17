package Booking;

public class CustomHashMapRunner {
	
	public static void main(String args[]) {
		
		CustomHashMap<String, String> c1=new CustomHashMap<>(20);
		
		System.out.println(c1.put("One", "1"));
		System.out.println(c1.put("Two", "2"));
		System.out.println(c1.put("One", "1"));
		
		CustomHashMap<Integer, String> c2=new CustomHashMap<>(6);
		
		System.out.println(c2.put(8, "Eight"));
		System.out.println(c2.put(9, "Nine"));
		System.out.println(c2.put(2, "Two"));
		System.out.println(c2.put(8, "Eight Updated"));
		
		System.out.println(c2.getValue(8));
		
	}

}
