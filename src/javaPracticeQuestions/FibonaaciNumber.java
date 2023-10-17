package javaPracticeQuestions;

import java.util.*;

public class FibonaaciNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int a=0;
			int b=1;
			int sum=0;
			
			System.out.println(a+"\n"+b);
			while(a+b<=n) {
				sum=a+b;
				a=b;
				b=sum;
				System.out.println(sum);
			}
			
		}
		
	}

}
