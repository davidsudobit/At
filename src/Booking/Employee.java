package Booking;

public class Employee {
	
	private String empName;
	private Double empSalary;
	private Integer empAge;
	private String empStatus;
	
	public Employee() {
		
	}
	
	public Employee(String empName, Double empSalary, Integer empAge, String empStatus) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.empStatus = empStatus;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge + ", empStatus="
				+ empStatus + "]";
	}

}
