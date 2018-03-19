package com.jobhelp.loop;

public class Var {
	
	public static void main(String[] args) {
		
/*//		declare variable
		int intVar = 1000;
		double doubleVar = 100.75;
//		char charVar = 'K';
		
//		System.out.println(intVar);
//		System.out.println(doubleVar);
		char[] charVar =new char[4];
		charVar [0]='J';
		charVar [1]='o';
		charVar [2]='h';
		charVar [3]='n';
		
		
		System.out.print(charVar[0]);
		System.out.print(charVar[1]);
		System.out.print(charVar[2]);
		System.out.println(charVar[3]);
//		System.out.println(charVar[0]+charVar[1]+charVar[2]+charVar[3]);
		System.out.println("jo hn 100");*/
		
		int[] rollNum = new int[101];
		
/*		rollNum[0] = 1; i = 0, 0 + 1 = 1
		rollNum[1] = 2; i = 1, 1 + 1 = 2
		rollNum[2] = 3; i = 2, 2 + 1 = 3
		rollNum[3] = 4; i = 3, 3 + 1 = 4
		rollNum[4] = 5; i = 4, 4 + 1 = 5
		rollNum[5] = 6; i = 5, 5 + 1 = 6
		
		This is a comment */
		
		for (int i=0; i<101; i++) { // i = 0 - 5 
			rollNum[i] = i+1; // 0 - 5; 
			System.out.println("rollNum[" + i + "] = " + rollNum[i]); // 0 - 5; 0 - 6; 1 - 6
		}
		
//		System.out.println(rollNum[5]);
	}

}
