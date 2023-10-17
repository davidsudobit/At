package javaPracticeQuestions;

import java.util.*;

public class ArmStrongNumber {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			int temp=n;
			int sum=0;
			
			while(n>0) {
				int r=n%10;
				sum+=Math.pow((double)r, 3);
				n/=10;
			}
			
			System.out.println((sum==temp)?"True":"False");
			
		}
		
	}

}
