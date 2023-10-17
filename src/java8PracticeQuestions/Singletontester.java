package java8PracticeQuestions;

import java.lang.reflect.Constructor;

public class Singletontester {

	
	public static void main(String args[]) throws Exception{
		SingletonClass single=SingletonClass.single;
//		single.setPassword("12345");
		SingletonClass single01=SingletonClass.single;
//		System.out.println(single01.getPassword());
		
		Class<SingletonClass> singleton=SingletonClass.class;
		
		Constructor<SingletonClass> constructor=singleton.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		
		single=constructor.newInstance();
//		single.setPassword("123456");
		
		single01=constructor.newInstance();
//		single01.setPassword("1234");
		
//		System.out.println(single01.getPassword());
	}

}
