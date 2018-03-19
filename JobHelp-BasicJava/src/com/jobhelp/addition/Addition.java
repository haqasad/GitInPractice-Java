package com.jobhelp.addition;

public class Addition {
	
	public static int addNum(int a, int b) {
		int num1 = a;
		int num2 = b;
		int num3 = num1 + num2;
//		System.out.println(num3);
		return num3;
	}
	
	public static void main(String[] args) {
		
		int getNum1 = addNum(5,7);
//		System.out.println(addNum());
		
		int myNum = getNum1 + 5;
		
		int getNum2 = myNum + 20;
		System.out.println(getNum2);
//		addNum(30,30);
	}

}
