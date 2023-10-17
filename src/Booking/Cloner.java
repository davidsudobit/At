package Booking;

public class Cloner{
	
	String str="Test data";
	
	public static void main(String args[]) throws CloneNotSupportedException{
		
		Cloner01 cloner01=new Cloner01();
		
		Cloner01 cloner02=(Cloner01)cloner01.clone();
		
		cloner01.str="After cloned";
		cloner01.cloner.str="Test data changed";
		cloner01.a=Integer.valueOf(30);
		
		System.out.println(cloner01);
		System.out.println(cloner02);
		
	}

	@Override
	public String toString() {
		return "Cloner [str=" + str + "]";
	}
	
}

class Cloner01{
	
	Integer a=Integer.valueOf(20);
	String str="not Cloned";
	Cloner cloner=new Cloner();
	
	public Cloner01() {
		
	}
	
	public Cloner01(int a,String str) {
		this.a=a;
		this.str=str;
		this.cloner.str="Test data changed";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		new Cloner01();
		return "Cloner01 [a=" + a + ", str=" + str + ", cloner01=" + cloner + "]";
	}
	
}
