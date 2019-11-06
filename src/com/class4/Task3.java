package com.class4;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("enter the amount");
		Scanner keyboard=new Scanner(System.in);
		long loan=keyboard.nextLong();
		if(loan<200000) {
			System.out.println("i would lend money");
			
		}else {
			System.out.println("I would reject the client");
		}
	}
}
