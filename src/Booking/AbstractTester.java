package Booking;

abstract class AbstractClass{
	
	public AbstractClass() {
		init();
	}
	
	public abstract void init();
	
}

public class AbstractTester extends AbstractClass{
	
	public static void main(String args[]) {
		
		AbstractTester abstractTester=new AbstractTester02();
		
	}
	
	@Override
	public void init() {
		System.out.println("In AbstractTester");
	}
	
}

class AbstractTester02 extends AbstractTester{
	
}
