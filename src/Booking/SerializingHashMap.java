package Booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializingHashMap {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		HashMap<String,String> h1=new HashMap<>();
		
		for(int i=1;i<=10;i++) {
			h1.put("Key"+(10-i), "Value"+(i==10?9:i));	
		}
		
		FileOutputStream fileToWrite=new FileOutputStream(new File("C:/Users/sr73/OneDrive - Capgemini/Desktop/StringHashMap.ser"));
		ObjectOutputStream objWritter=new ObjectOutputStream(fileToWrite);
		objWritter.writeObject(h1);
		
		FileInputStream fileToRead=new FileInputStream(new File("C:/Users/sr73/OneDrive - Capgemini/Desktop/StringHashMap.ser"));
		ObjectInputStream objReader=new ObjectInputStream(fileToRead);
		h1=(HashMap<String,String>)objReader.readObject();
		System.out.println(h1);
		
	}

}
