package com.class8;

public class ClassTaskFor {
	
	public static void main(String[] args) {
		
		//print numbers from 1-100 in one line
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		//print number from 100-1
		System.out.println("*******************");
		for(int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		//print even number from 20-1
		for(int c=20; c>=1; c-=2) {
			System.out.println(c);
		}
		System.out.println("*****************");
		//print odd numbers between 20-50
		//for(int d=20; d<=50 && d%2==1; d++) {
			//System.out.println(d);
		//}
		for(int d=20; d<=50; d++) {
			 if(d%2!=0) {
			System.out.println(d);
			 }
			//second way
			 //for(int d=21; d<=50; d+=2) {
			// System.out.println(d);
			 //}
	}
	}
}
