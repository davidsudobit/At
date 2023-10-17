package com.atone;

import java.util.*;

public class ChessMove {
	
	public static int isPossible(int x1,int x2,int y1,int y2) {
		
		if(x1==y1&&x2==y2) {
			return 0;
		}
		
		if(x1==x2&&y1==y2||(x1-x2)==(y1-y2)||((y1==x1-1||y1==x1+1)&&(y2==x2-1||y2==x2+1))) {
			return 1;
		}
		else if((x1+x2)%2==(y1+y2)%2) {
			return 2;
		}
		else {
			return 8;
		}
	}
	
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int x1=scanf.nextInt();
		int x2=scanf.nextInt();
		int y1=scanf.nextInt();
		int y2=scanf.nextInt();
		
		System.out.println(isPossible(x1,x2,y1,y2));
	}
}
