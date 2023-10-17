package Booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonEnumTester {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
		
		singletonEnum.setValue("One");
		
		SingletonEnum singletonEnum02=SingletonEnum.INSTANCE;
		
		singletonEnum02.setValue("Two");
		
		System.out.println(writeObject(singletonEnum02));
		
		singletonEnum02.setValue("Three");
		
		SingletonEnum singletonEnum03=readObject();
		
		if(singletonEnum.getValue().equals(singletonEnum03.getValue())) {
			System.out.println("Successfull");
			System.out.println(singletonEnum02.getValue()+" "+singletonEnum03.getValue());
		}
		
	}
	
	public static String writeObject(SingletonEnum singletonEnum) {
		
		File file=new File("C:\\Users\\sr73\\OneDrive - Capgemini\\Desktop\\singleton.ser");
		try {
			
			FileOutputStream fileout=new FileOutputStream(file);
			ObjectOutputStream objectOut=new ObjectOutputStream(fileout);
			objectOut.writeObject(singletonEnum);
			objectOut.close();
			fileout.close();
			
			return "Write complete";
		
		} catch (FileNotFoundException e) {
			return "File not found";
		} catch(NotSerializableException e) {
			return "Serialization Error";
		} catch (IOException e) {
			return "Write incomplete";
		}
		
	}
	
	public static SingletonEnum readObject() {
		
		File file=new File("C:\\Users\\sr73\\OneDrive - Capgemini\\Desktop\\singleton.ser");
		
		try {
			
			FileInputStream fileIn=new FileInputStream(file);
			ObjectInputStream objectIn=new ObjectInputStream(fileIn);
			SingletonEnum singletonEnum=(SingletonEnum)objectIn.readObject();
			objectIn.close();
			fileIn.close();
			
			return singletonEnum;
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch(NotSerializableException e) {
			System.out.println("Serialization Error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
		
		return null;
		
	}
	
	public void println() {
		System.out.println();
	}

}
