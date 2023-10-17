package java8PracticeQuestions;

public class StudentSingleton {
	
	private Long studentId;
	private String studentName;
	private String teacher;
	
//	public static final StudentSingleton studentSingleton=new StudentSingleton();
	public static StudentSingleton student;
	
//	static {
//		student=new StudentSingleton(1L,"Finch","Larry");
//	}
	
	private StudentSingleton() {
		
	}
	
	private StudentSingleton(Long studentId,String studentName,String teacher) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.teacher=teacher;
	}
	
//	public static StudentSingleton getStudent() {
//		return student;
//	}
	
	public static StudentSingleton getStudent(Long studentId,String studentName,String teacher) {
		
		if(studentId==null||studentName.isBlank()||teacher.isBlank()) {
			return student;
		}
		
		if(student==null) {
			student=new StudentSingleton();
		}
		
		student.studentId=studentId;
		student.studentName=studentName;
		student.teacher=teacher;
		
		return student;
		
	}

	@Override
	public String toString() {
		return "StudentSingleton [studentId=" + studentId + ", studentName=" + studentName + ", teacher=" + teacher
				+ "]";
	}
	
	

}
