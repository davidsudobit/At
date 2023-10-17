package Booking;

public class StringReverser01 {
	
	public static void main(String args[]) {
		
		String str="10 20 30";
		int k=0;
		String out="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '||i==str.length()-1) {
				
				String str01=new String();
				for(int j=k;j<((i==str.length()-1)?str.length():i);j++) {
					str01+=str.charAt(j);
				}
				out=str01+(k==0?"":" ")+out;
				k=i+1;
				
			}
		}

		System.out.println(out);
		
	}

}
