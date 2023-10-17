package javaPracticeQuestions;

public class ReverseEachOfString {
	
	public static void main(String args[]) {
		
		String str="Capgemini india";
		int k=0;
		String out="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '||i==str.length()-1) {
				for(int j=(i==str.length()-1)?i:i-1;j>=k;j--) {
					out+=str.charAt(j);
				}
				out+=" ";
				k=i+1;
			}
		}
		
		System.out.println(out);
		
	}

}
