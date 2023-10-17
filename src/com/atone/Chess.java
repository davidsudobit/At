package com.atone;

import java.util.*;

public class Chess {
	private static int CheckCollide(int x1, int y1, int x2, int y2){
		if(x1 < 0 || x2 < 0 || x1 > 7 || x2 > 7 ||y1 < 0 || y2 < 0 || y1 > 7 || y2 > 7)
		{
		System.out.println("Invalid place!!! Out of chess board");
		return -1;
		}
		if((x1 + y1)%2 != (x2 + y2)%2)
		{
		System.out.println("Collision not possible");
		return -1;
		}
		if((x1 + x2) == (y1 + y2) || (x1 - x2) == (y1 - y2))
		{
		//Direct hit possible
		return 1;
		}
		else
		return 2;
		}
	
		public static void main(String args[])
		{
			Scanner scanf=new Scanner(System.in);
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		int m = scanf.nextInt();
		int n = scanf.nextInt();
		System.out.println("Optimal move: " + CheckCollide(/*x1,y1*/ a,b,/*x2, y2*/m,n));
		}
}

