package java8PracticeQuestions;

import java.util.*;

public class BubbleSort {

	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=10;
			
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			
			for(int i=0;i<n-1;i++) {
				for(int j=i;j<n;j++) {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
