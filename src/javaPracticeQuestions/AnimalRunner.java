package javaPracticeQuestions;

public class AnimalRunner {
		
	public static void main(String args[]) {
		
		Animal animal=new Dog();
		animal.eat();
		
	}
}

class Animal{
	
	public void eat() {
		System.out.println("Eat");
	}
	
}

class Dog extends Animal{
	
	public void run() {
		System.out.println("Run");
	}
	
}
