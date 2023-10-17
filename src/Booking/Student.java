package Booking;

public class Student implements Comparable<Student>,University{
	
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.getStudentName().compareTo(o.getStudentName());
	}

}
