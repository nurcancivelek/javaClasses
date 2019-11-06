package com.class8;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		for( int i=0; i<10; i++) {
			if(i==5
					) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println("i am outside of the loop");
		System.out.println();
		
		//continue;it will skip the current iteration
		
		//i want to print number from 1-20 except 5,6,7
		for(int b=1; b<=20; b++) {
			if(b==5 || b==6 || b==7) {//if(a>=5 && a<=7) da olabilir
				continue;
			}
			System.out.print(b+ " ");
		}
	}
}
