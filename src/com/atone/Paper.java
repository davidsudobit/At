package com.atone;

import java.util.*;

public class Paper {
	public static void main(String args[]) {
	
		try(Scanner scanf=new Scanner(System.in)){
			
			HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
			h1.put(1, 1);
			if(h1.containsKey(1)) {
				h1.put(1, h1.get(1)+1);
			}
			
			h1.entrySet().forEach((entry)->{
				
			});
			
			
			System.out.println(h1);
		int n=scanf.nextInt();
		scanf.nextLine();
		char arr[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanf.nextLine().charAt(0);
			}
		}
		
		int diagonal=0,inner=0;
		
		if(n<=2) {
			
			int count=0;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j]==arr[0][0]) {
						count++;
					}
				}
			}
			
			if(count==n*n) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||j==n-i-1) {
					if(arr[i][i]==arr[0][0]||arr[i][n-i-1]==arr[0][0]) {
						diagonal++;
					}
				}
				else {
					if(arr[i][j]==arr[0][1]) {
						inner++;
					}
				}
			}
		}
		
		if(diagonal==n*2-1&&inner==n*n-diagonal) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		}
		
	}
}
