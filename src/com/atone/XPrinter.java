package com.atone;

import java.util.*;

public class XPrinter {
	
	public static void main(String args[]) {
		
		try(Scanner scanf=new Scanner(System.in)){
			
			int n=scanf.nextInt();
			n=n+n-1;
			System.out.println();
			int k=n-1;
			
			for(int i=0;i<n;i++) {
				
				for(int l=0;l<n;l++) {
					if(l==i||l==k) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
				
				k--;
				
			}
			
		}
		
	}

}
