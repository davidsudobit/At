package java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class StudentSingletonTester {
	
	public static void main(String args[]) {
		
		List<StudentSingleton> studentList=Arrays.asList(StudentSingleton.getStudent(1L, "Finch", "Larry"),StudentSingleton.getStudent(2L, "Ben", "Caine"));
		
		studentList.forEach(System.out::println);
		
	}

}
