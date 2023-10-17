package Booking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MethodGenericsPracRunner {
	
	public static void main(String args[]) {
		
		MethodGenericsPrac<Integer, List<Integer>> mg=new MethodGenericsPrac<>();
		
		System.out.println( mg.<Integer>getInstance(new LinkedList<Double>(Arrays.asList(1.,2.,3.,4.,5.)),new LinkedList<Integer>(Arrays.asList(1,2,3))));
		
	}

}
