package Booking;

import java.util.stream.Stream;

public class EmployeeMapper {
	
	public static void main(String args[]) {
		
		Stream.of(new Employee("Harry",Double.valueOf(10000),Integer.valueOf(34),"WORKING"),new Employee("Henry",Double.valueOf(12000),Integer.valueOf(24),"WORKING"),new Employee("Kane",Double.valueOf(28000),Integer.valueOf(62),"WORKING"),new Employee("Marry",Double.valueOf(25000),Integer.valueOf(64),"WORKING")).map(employee->{
			
			if(employee.getEmpAge().intValue()>25&&employee.getEmpAge()<=60) {
				employee.setEmpSalary(employee.getEmpSalary().doubleValue()+employee.getEmpSalary().doubleValue()*0.10);
			}
			else if(employee.getEmpAge().intValue()>60){
				employee.setEmpStatus("RETIRED");
			}
			
			return employee;
			
		}).forEach(System.out::println);
		
	}

}
