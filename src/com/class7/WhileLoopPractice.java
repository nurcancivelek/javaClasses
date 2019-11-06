package com.class7;

public class WhileLoopPractice {
	public static void main(String[] args) {
		//how to print numbers from 1 to 20
		
		//int i=1;
		//while(i<=20) {
			//System.out.println(i);
			//i++;
		
		//i want to print numbers from 10 30 all in 1 line
		//int y=10;
		//while(y<=30) {
			//System.out.print(y+" ");
			//y++;
		//}
		
		//print values from 50 to 20
		
		//int v=20;
		//while(v<=50) {
			//System.out.print( v+" ");
		//v++;	
		//}
		//2 way using modulus
		
		int q=1;
		
		while(q<=20) {
			System.out.println(" . ");
			if(q%2==0) {
				System.out.println(q);
				q++;
			}
			q++;
		}
		System.out.println("**********");
		//print only odd number from 50 to 100
		//print only even numbers from 100 to 1
		int o=50;
		while(o<=100) {
			if(o%2==1) {
				System.out.print(o+" ");
			}
			o++;
		}
		System.out.println("**************");
		//print only even numbers from 100 to 1
		int e=100;
		while(e>=1) {
			if(e%2==0) {
				System.out.print(e+" ");
			}
			e--;
		}
	}
}
