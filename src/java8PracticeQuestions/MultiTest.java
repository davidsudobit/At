package java8PracticeQuestions;

public class MultiTest {
	
	public static void main(String args[]) {
		
		System.out.println(new MyClass().myMethod());
		System.out.println(new MyClass01().myMethod());
		
	}
	
}

interface MyInterface1<T> {
    T myMethod();
}

interface MyInterface2<T> {
    T myMethod();
}

class MyClass implements MyInterface1<Integer> {

	@Override
	public Integer myMethod() {
		return 1;
	}
    
}

class MyClass01 implements MyInterface2<String>{

	@Override
	public String myMethod() {
		return "One";
	}
	
}

