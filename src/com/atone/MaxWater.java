package com.atone;

import java.util.*;

public class MaxWater {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		waterLevel(arr);
	}
	
	public static int waterLevel(int arr[]) {
		
		int max=0,count=0,start=0,end=0;
		
		for(int i=arr.length-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>=arr[i]) {
					
				}
			}
		}
		System.out.println(max);
		return max;
	}
}
