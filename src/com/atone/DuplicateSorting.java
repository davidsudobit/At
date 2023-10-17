package com.atone;

import java.util.*;

public class DuplicateSorting {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int arr[]=new int[n];
		int arr01[][]=new int[n][n];
		int one=0,two=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++) {
			count=0;
			two=0;
			arr01[one][two++]=arr[i];
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				i+=count-1;
			}
			arr01[one][two]=count;
			one++;
		}
		
		for(int i=0;i<one-1;i++) {
			for(int j=i;j<one;j++) {
				if(arr01[i][1]<arr01[j][1]) {
					int temp01=arr01[i][0];
					int temp02=arr01[i][1];
					arr01[i][0]=arr01[j][0];
					arr01[i][1]=arr01[j][1];
					arr01[j][0]=temp01;
					arr01[j][1]=temp02;
				}
				else if(arr01[i][1]==arr01[j][1]) {
					if(arr01[i][0]>arr01[j][0]) {
						int temp01=arr01[i][0];
						int temp02=arr01[i][1];
						arr01[i][0]=arr01[j][0];
						arr01[i][1]=arr01[j][1];
						arr01[j][0]=temp01;
						arr01[j][1]=temp02;
					}
				}
			}
		}
			
		for(int i=0;i<one;i++) {
			for(int j=0;j<arr01[i][1];j++) {
				System.out.print(arr01[i][0]+" ");
			}
		}
	}
}
