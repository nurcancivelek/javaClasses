package com.class9;

import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter a number between 1 and 20");
		
		// my magic number
		int a=20;
		
		while (true) {
			int guess=scan.nextInt();
			if (guess>20 || guess<0) {
				System.out.println("invalid number, keep trying");
			}else if(guess>a) {
				System.out.println("too big, keep trying");
			}else if(guess<a) {
				System.out.println("too small, keep trying");
			}else if(guess==a) {
				System.out.println("congrats you found the magic number!!");
				break;
			}
			
		}		
	}			
}