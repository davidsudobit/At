package javaPracticeQuestions;

import java.util.*;

public class TreeSetAndEmployeeObjects {
	
	public static void main(String args[]) {
		
		Set<Employee> empSet=new TreeSet<>();
		
		empSet.add(new Employee(1,"Renny"));
		empSet.add(new Employee(1,"Renny"));
		
		empSet.forEach(System.out::println);
		
	}

}

class Employee  implements Comparable<Employee>{
	
	private long empId;
	private String empName;
	
	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}
	
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o==null || !(o instanceof Employee)) return false;
		
		Employee emp=(Employee)o;
		
		return emp.getEmpId()==this.getEmpId()&&emp.empName.equals(this.empName);
		
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(String.valueOf(empId))*10+25;
	}

	@Override
	public int compareTo(Employee emp) {
		
		if(this.getEmpId()==emp.getEmpId()) {
			
			return this.getEmpName().compareTo(emp.empName);
			
		}
		else {
			return ((Long)emp.getEmpId()).compareTo(this.getEmpId());
		}
		
	}
	
}
