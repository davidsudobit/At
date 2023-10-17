package javaPracticeQuestions;

public class Pyramid {
	
	public static void main(String args[]) {
		
		int n=10;
		int count=1;
		int k=n-1;
		
		for(int i=1;count<=n;i+=2) {
			
			for(int j=1;j<=k;j++) {
				System.out.print(" ");
			}
			
			k--;
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			count++;
			
			System.out.println();
		}
		
	}

}
