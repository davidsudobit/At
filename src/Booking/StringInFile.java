package Booking;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringInFile {
	
	public static void main(String args[]) throws IOException {
		
		File file=new File("C://Users/sr73/OneDrive - Capgemini/Desktop/newFile.txt");
		
		if(file.createNewFile()) {
			System.out.println("created");
		}
		
		FileReader reader=new FileReader(file);
//		Scanner scanf=new Scanner(file);
		
		int temp=0;
		StringBuilder sb=new StringBuilder();
		
		while((temp=reader.read())!=-1) {
			
			sb.append((char)temp);
			
		}
		
//		while(scanf.hasNextLine()) {
//			
//			sb.append(scanf.nextLine());
//			
//		}
		
		String str=sb.toString();
		
		System.out.println(str.toLowerCase().contains("THE".toLowerCase()));
		
	}

}
