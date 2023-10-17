package javaPracticeQuestions;

public class LShape {
	
	public static void main(String args[]) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			if(i<n-1) {
				System.out.println("*");
			}
			else {
//				System.out.print(" ");
				for(int j=0;j<n;j++) {
					System.out.print("* ");
				}
			}
		}
		
	}

}
