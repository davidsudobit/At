package Booking;

public class Employee01 implements Comparable<Employee01>{
	
	private String employeeName;
	
	private String employeeEmail;
	
	public Employee01() {
		
	}

	public Employee01(String employeeName, String employeeEmail) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public int compareTo(Employee01 o) {
		
		return this.getEmployeeEmail().compareTo(o.getEmployeeEmail());
		
	}

	@Override
	public String toString() {
		return "Employee01 [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + "]";
	}

}
