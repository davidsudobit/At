package java8PracticeQuestions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumbers {
	
	public static void main(String args[]) {
		Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49).stream().filter(n->n%2==0).forEach(System.out::println);
		
		Arrays.asList(17, 21, 42, 32, 2, 49, 16, 27, 19, 44, 36, 41, 10, 48, 14, 11, 22, 8, 50, 29, 28, 9, 13, 6, 25, 20, 28, 5, 23, 33, 49, 15, 4, 50, 1, 46, 3, 39, 35, 38, 26, 47, 50, 24, 7, 30, 12, 18, 31, 35, 43, 49).stream().collect(Collectors.toList());
		
		Arrays.asList(new Student(1,"Jane",17),new Student(2,"henry",20),new Student(3,"Venice",17),new Student(4,"Larry",20),new Student(5,"Kevin",20),new Student(6,"Liam",17)).stream().collect(Collectors.groupingBy(Student::getStudentAge,Collectors.mapping(Student::getStudentName,Collectors.toSet()))).entrySet().forEach(System.out::println);
	}

}

class Student{
	
	public long studentId;
	public String studentName;
	public long studentAge;
	
	public Student(long studentId,String studentName,long studentAge) {
		this.studentId=studentId;
		this.studentAge=studentAge;
		this.studentName=studentName;
	}
	
	public long getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public long getStudentAge() {
		return this.studentAge;
	}
	
	public void setStudentAge(long studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
}
