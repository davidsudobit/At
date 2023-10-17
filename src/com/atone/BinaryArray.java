package com.atone;

import java.util.*;

public class BinaryArray {
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanf.nextInt();
		}
		
		int k=scanf.nextInt();
		
		int count=0,max=0,start=0,end=0,temp01=0,temp02=0,ones=0,zeros=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				if(count==1) {
					temp01=i;
				}
				
				if(count>1) {
					temp02=i;
				}
			}
			else if(arr[i]==0) {
				if(count>=1) {
					count=0;
				}
			}
			
			if(count>max) {
				max=count;
				start=temp01;
				end=temp02;
			}
			
			if(arr[i]==1) {
				ones++;
			}
			else {
				zeros++;
			}
		}
		
		int sum01=0,sum02=0,sumt=0,subone01=0,subone02=0,min01=0,min02=0;
		for(int i=start-1;i>=0;i--) {
			if(arr[i]==0) {
				sumt++;
			}
			else {
				if(i!=0) {
					sum01+=sumt;
					if(sum01<=k) {
						min01=sum01;
					}
				}
				else if(arr[i]!=1) {
					sum01+=sumt;
				}
				
				if(arr[i]==1&&arr[i+1]==0) {
					subone01++;
				}
				sumt=0;
			}
		}
		
		sumt=0;
		for(int i=end+1;i<n;i++) {
			if(i<n) {
				if(arr[i]==0) {
					sumt++;
				}
				else {
					sum02+=sumt;
					if(sum02<=k) {
						min02=sum02;
					}
					if(arr[i]==1&&arr[i-1]==0) {
						subone02++;
					}
					sumt=0;
				}
			}
		}
		
		if(sum01==k) {
			int total=ones-max;
			if(total>=sum01) {
				System.out.println(ones);
			}
		}
		else if(sum02==k){
			int total=ones-max;
			if(total>=sum02) {
				System.out.println(ones);
			}
		}
		else {
			if(min01<min02) {
				int total=ones-(subone01+max);
				if(total>=min01) {
					System.out.println(min01+subone01+max);
				}
			}
			else {
				int total=ones-(subone02+max);
				if(total>=min02) {
					System.out.println(min02+subone02+max);
				}
			}
		}
		
		System.out.println(max+" "+start+" "+end);
		System.out.println(sum01+" "+sum02);
		System.out.println(subone01+" "+subone02);
		System.out.println(ones+" "+zeros);
	}
}
