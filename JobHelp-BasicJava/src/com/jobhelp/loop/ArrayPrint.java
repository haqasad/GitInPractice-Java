/*
 * Print the reverse of a given String array
 * */

package com.jobhelp.loop;

public class ArrayPrint {

	public static void main(String[] args) {

		String[] userName = new String[10]; // 10
		userName[0]="kamal";
		userName[1]="bristi";
		userName[3]="nazrul";
		userName[4]="asad";
		userName[5]="ali";
		userName[8]="nizam";

		for(int i= (userName.length - 1); i>=0; i--) {
			System.out.println(userName[i]);			
		}
//		System.out.println("Array Size: " + userName.length);
	}
}
