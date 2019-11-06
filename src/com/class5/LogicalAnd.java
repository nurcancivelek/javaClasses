package com.class5;

public class LogicalAnd {
	public static void main(String[] args) {
		/*
		 * if number is between 1-10==this number is small
		 * if number is between 10-100==this number is medium
		 * if number is between 100-1000==this number is large
		 * any other number== is out of range
		 */
	int n=300;
		if (n>1 && n<10) {
			System.out.println("this number is small");
		}else if (n>=10 && n<100) {
			System.out.println("this number is medium");
		}else if (n>=100 && n<1000 ) {
			System.out.println("this number is large");
		}else {
			System.out.println("this number is out of our range");
		}
	}
}
