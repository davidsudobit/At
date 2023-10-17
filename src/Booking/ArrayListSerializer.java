package Booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ArrayListSerializer {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		List<String> l1=new ArrayList<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy"));
		
		//Writting state of an object
		FileOutputStream fileToWrite=new FileOutputStream(new File("C:/Users/sr73/OneDrive - Capgemini/Desktop/StringArrayList.ser"));
		ObjectOutputStream objWritter=new ObjectOutputStream(fileToWrite);
		objWritter.writeObject(l1);
		
		//Reading state of an object
		FileInputStream fileToRead=new FileInputStream(new File("C:/Users/sr73/OneDrive - Capgemini/Desktop/StringArrayList.ser"));
		ObjectInputStream objReader=new ObjectInputStream(fileToRead);
		l1=(ArrayList<String>)objReader.readObject();
		System.out.println(l1);
		
	}

}
