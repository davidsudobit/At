package java8PracticeQuestions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		//File file= new file()
		FileWriter writter= new FileWriter("C:/temp01.txt");
		String a= "This is a file test";
		writter.write(a);
		writter.flush();
		int i=0;
		FileReader reader= new FileReader("C:/temp01.txt");
		while( (i=reader.read())!=-1){
			System.out.print((char)i);
		}
	}

}

