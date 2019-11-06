package com.class5;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("do you have a credit card? true or false");
		boolean cc = keyboard.nextBoolean();
		
		if(cc) {
			System.out.println("what is the balance of your card?");
			int balance=keyboard.nextInt();

			if(balance>1000) {
				System.out.println("please pay you balance");
			}else {
				System.out.println("you can spend more money");
			}
		}else {
			System.out.println("would you like to aplly for a cc ?");
		}
		keyboard.close();
	}
}
