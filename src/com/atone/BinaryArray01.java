package com.atone;

import java.util.*;

public class BinaryArray01 {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		int k=scanf.nextInt();
		int count=0,l=0,max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
			
			while(count>k) {
				if(arr[l]==0) {
					count--;
				}
				l++;
			}
			
			max=(i-l+1)>max?i-l+1:max;
		}
		
		System.out.println(max);
	}
}
