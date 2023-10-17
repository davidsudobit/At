package javaPracticeQuestions;

public class MaxAndMinInArray {
	
	public static void main(String args[]) {
		
		int arr[] = {450, 567, 234, 654, 123, 345, 678, 432, 321, 456, 
                589, 214, 345, 678, 452, 201, 530, 367, 189, 312, 
                623, 695, 587, 465, 289, 352, 512, 686, 198, 422, 
                678, 154, 337, 528, 432, 610, 306, 460, 655, 173, 
                659, 522, 666, 123, 411, 304, 506, 214, 562, 689};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Min: "+min+" Max: "+max);
		
	}

}
