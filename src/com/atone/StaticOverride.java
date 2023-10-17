package com.atone;

public class StaticOverride {
	
	public static void main(String args[]) {
		
	}
	
	public static int test01(int value1,int value2) {
		return 1;
	}

}

class StaticOverrideExtend extends StaticOverride implements Comparable<StaticOverrideExtend>{
	
	public static int test01(int value01,int value02) {
		Test1.ret();
		return 3;
	}
	
	public static int test01(int value01,String value02) {
//		Set<Integer> s1=new TreeS
		new StaticOverride();
		return 2;
	}
	
	@Override
	public int compareTo(StaticOverrideExtend so1) {
		
		return 1;
//		the.compare()
//		
//		compare(the 01,the 02){
//			
//		}
//		if(this.test01(0, 0))
	}
	
}

interface Test1{
	
	public static void ret() {
		
	}
	
	public default void retu() {
		
	}
	
	public default void ty() {
		
	}
}
