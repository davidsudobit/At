package java8PracticeQuestions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletonClass {
	
	public int password=10;
	
	public long value;
	
	static SingletonClass single;

	static {
		SingletonClass.single=new SingletonClass();
	}
	
	private SingletonClass() {
		
	}
	
	public SingletonClass getInstance() {
		return SingletonClass.single;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	public static void main(String args[]) throws Exception{
		SingletonTest01.ren();
	}

	
}

class SingletonTest01{
	
	public static void ren() throws Exception{
		Class<SingletonClass> singleton=SingletonClass.class;
		String password="password";
		Field field=singleton.getDeclaredField(password);
		
//		field.setAccessible(true);
				
		
		
		Constructor<SingletonClass> constructor=singleton.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		
		SingletonClass single=constructor.newInstance();
		single.value=10;
		
		field.setInt(single.password, 20);
		System.out.println(field.getInt(field));

	}
}
