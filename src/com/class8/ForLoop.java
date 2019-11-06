package com.class8;

public class ForLoop {
	
	public static void main(String[] args) {
		
		//say good morning 5 times
			//initialize	//test conditiom			increment
		for(int i=0;     			 i<=4;    				 i++) {
			System.out.println("good morning");
		}
		System.out.println("**************");
		//print numbers from 10 to 1
		for(int a=10; a>=1; a--) {
			System.out.println(a);
		}
		System.out.println("**************");
		//print numbers from 1-10
		for(int e=1; e<=10; e++) {
			System.out.println(e);
		}
		
		System.out.println("**************");
		
		for(int b=0; b<=50; b+=5) {
			System.out.print(b+" " );
		}
	}

}
