package com.atone;

import java.util.*;

public class PositionOfElement {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		
		int n=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		int k=scanf.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==k-1) {
				System.out.println(i+1);
				break;
			}
			
			if(arr[i]==k+1) {
				if(i==0) {
					System.out.println(0);
					break;
				}
				
				if(arr[i-1]!=k-1) {
					System.out.println(i);
					break;
				}
				System.out.println(i-1);
				break;
			}
			
			if(arr[i]==k) {
				System.out.println(i);
				break;
			}
			
			if(k>arr[arr.length-1]&&(k-arr[arr.length-1])>=2) {
				System.out.println(arr.length);
				break;
			}
			
		}
	}
}
