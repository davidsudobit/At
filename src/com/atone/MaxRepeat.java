package com.atone;

import java.util.*;

public class MaxRepeat {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		String str=scanf.nextLine();
		String str01[]=str.split(" ");
		int max=0,maxIndex=-1,count=0,count01=0;
		
		for(String temp:str01) {
			for(int i=0;i<temp.length()-1;i++) {
				count=0;
				for(int j=i+1;j<temp.length();j++) {
					if(temp.charAt(i)==temp.charAt(j)) {
						count++;
					}
				}
				if(count>1&&count>max) {
					max=count;
					maxIndex=count01;
				}
			}
			count01++;
		}
		
		if(maxIndex>=0)
			System.out.println(str01[maxIndex]);
		else
			System.out.println(String.valueOf(maxIndex));
	}
}
