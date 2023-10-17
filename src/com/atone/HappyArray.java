package com.atone;

import java.util.Scanner;

public class HappyArray {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
						
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				int k=i;
				int sum01=arr[i];
				while(sum01>=0&&k<n) {
					sum+=sum01;
					if(++k<n) {
						sum01+=arr[k];
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
