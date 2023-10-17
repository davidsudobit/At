package javaPracticeQuestions;

import java.util.*;

public class MagicNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int sum=0;
			
			while(true) {
				
				while(n>0) {
					int r=n%10;
					sum+=r;
					n/=10;
				}
				
				if(sum<10) {
					break;
				}
				else {
					n=sum;
					sum=0;
				}
			}
			
			System.out.println(sum);
		
		}
			
		
			
	}

}
