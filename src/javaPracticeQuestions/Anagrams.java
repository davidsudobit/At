package javaPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			String str1=scanf.nextLine().toLowerCase();
			String str2=scanf.nextLine().toLowerCase();
			
			char char01[]=str1.toCharArray(); 
			char char02[]=str2.toCharArray();
			
			Arrays.sort(char01);
			Arrays.sort(char02);
			
			if(String.valueOf(char01).equals(String.valueOf(char02))) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
//			
//			for(int i=0;i<char01.length-1;i++) {
//				for(int j=i;j<char01.length;j++) {
//					if(char01[i]>char01[j]) {
//						char temp=char01[i];
//						char01[i]=char01[j];
//						char01[j]=temp;
//					}
//				}
//			}
			
		}
		
	}

}
