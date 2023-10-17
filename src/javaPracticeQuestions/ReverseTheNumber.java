package javaPracticeQuestions;

import java.util.Scanner;

public class ReverseTheNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int temp=n;
			int out=0;
			
			while(temp>0) {
				int r=temp%10;
				out=(out+r)*10;
				temp/=10;
			}
			
			out/=10;
			
			System.out.println((n==out)?"True":"False");
			
		}
		
	}

}
