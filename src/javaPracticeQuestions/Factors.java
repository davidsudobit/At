package javaPracticeQuestions;

import java.util.*;

public class Factors {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
			
		}
		
	}

}
