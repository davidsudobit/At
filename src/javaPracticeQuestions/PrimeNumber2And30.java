package javaPracticeQuestions;

public class PrimeNumber2And30 {
	
	public static void main(String args[]) {
		
		int count=0;
		
		for(int i=2;i<=20;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}

}
