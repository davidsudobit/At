package Booking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeSorter {
	
	public static void main(String args[]) {
		
		Set<Employee01> s1=new TreeSet<>(Arrays.asList(new Employee01("Kevin","kevin@gmail.com"),new Employee01("Kane","kane@gmail.com"),new Employee01("David","david@gmail.com")));
		
		s1.stream().sorted(Comparator.comparing(Employee01::getEmployeeEmail)).collect(Collectors.toCollection(LinkedHashSet<Employee01>::new)).forEach(System.out::println);
		
	}

}
