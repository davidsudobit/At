package java8PracticeQuestions;

interface Interface1{
	
	public int add(int n);
	
}

interface Interface2{
	
	public int add(int n);
	
}

public class InterfaceInheritor implements Interface1,Interface2{
	
	@Override
	public int add(int n) {
		return 1;
	}
	
	public static void main(String args[]) {
		System.out.println(new InterfaceInheritor().add(0));
	}

}
