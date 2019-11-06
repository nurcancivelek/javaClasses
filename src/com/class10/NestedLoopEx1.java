package com.class10;

public class NestedLoopEx1 {
	
	public static void main(String[] args) {
		for(int a=10; a>0; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();	
		}
		
		for(int c=1; c<11;c++) {
			for(int d=1; d<=c; d++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
