package com.atone;

import java.util.*;

public class HighestOddCube implements Cloneable{
	
	static int i=0;
    
    public static void function(){
//        System.out.println(i++);
//        List<Integer> l1=null;
    	
    	
    	try {
    		
    		HighestOddCube hg1=new HighestOddCube();
    		
			System.out.println(hg1+" "+hg1.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
//        l1.size();
    }
    
	public static void main(String[] args) {
		
		int i=0;
		
		function();
		
	}
	
//	public static void main(String args) {
//		List<Integer> l1=new LinkedList<>();
//		
//		for(int i=0;i<10;i++) {
//			l1.add(i+1);
//		}
//		
////		System.out.println(l1.stream().filter(n -> n%2!=0).map(n -> n*n*n).reduce());
//		
//		while(true) {
//			
//		}
//		
//
//	}

}
