package java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

interface DefaultMethodHolder{
	
	public default void get() {
		System.out.println("get");
	}
}

public class EmployeeSalaryIncreaser implements DefaultMethodHolder{
	
	@Override
	public void get() {
		DefaultMethodHolder.super.get();
		System.out.println("get01");
	}
	
	public static void main(String args[]) {
		
		List<Employee> l1=Arrays.asList(new Employee(1,"David","david@gmail.com",1000),new Employee(2,"Kane","kane@gmail.com",5000),new Employee(3,"Jenny","jenny@gmail.com",3000),new Employee(4,"Liam","liam@gmail.com",2000));
		
		l1.stream().filter(employee->employee.getEsalary()<=4000).map(employee->{
			
			employee.setEsalary((employee.getEsalary()*0.20)+employee.getEsalary());
			
			return employee;
			
		}).forEach(System.out::println);
		
		new EmployeeSalaryIncreaser().get();
	}

}
