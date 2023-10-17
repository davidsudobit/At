package com.atone;

import java.util.*;

public class Perimeter {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		
		int arr[]=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=scanf.nextInt();
		}
		
		System.out.println(Perimeter.perimeter(arr));
	}
	
	public static int perimeter(int arr[]) {
		int temp[]=new int[3];
		int k=0,max=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(j!=i) {
					temp[k++]=arr[j];
				}
			}
			
			double s=(temp[0]+temp[1]+temp[2])/2;
			
			double area=Math.sqrt(s*(s-(double)temp[0])*(s-(double)temp[1])*(s-(double)temp[2]));
			
			if(area>0) {
				max=max<temp[0]+temp[1]+temp[2]?temp[0]+temp[1]+temp[2]:max;
			}
			
			k=0;
		}
		return max;
	}
}