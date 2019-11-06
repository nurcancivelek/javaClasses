package com.class7;

public class SelfExercise {
	public static void main(String[] args) {
		int q=0;
		
		while(q<=20) {
			
			System.out.println(" . ");
			
			if(q%2==0) {
				System.out.println(q);
				q+=2;
			}else {			
				q++;
			}
		}
		
		System.out.println("**********");
	}
}
