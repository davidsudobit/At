package Booking;

public class PrivateDefaultMethod {
	
	public static void main(String args[]) {
		
		
	}

}

interface PrivateMethod{
	
	default void method() {
		
	}
	
	private int method01() {
		return 1;
	}
	
	static void method03() {
		
	}
	
}
