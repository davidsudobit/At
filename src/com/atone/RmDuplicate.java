package com.atone;

import java.util.*;

public class RmDuplicate {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int val=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==val) {
				for(int j=i;j<n-1;j++) {
					arr[j]=arr[j+1];
				}
				n--;
				if(arr[i]==val) {
					i--;
				}
			}
			
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.print("\n"+n);
	}
}
