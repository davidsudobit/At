package Booking;

public class Line {
	
	public static void main(String args[]) {
		Inherit01 in01=new Inherit02();
		
		System.out.println(in01.two());
		
//		Class<Integer> one=(Class<>)in01.getClass();
		System.out.println(in01.getClass().getSimpleName());
	}
}
