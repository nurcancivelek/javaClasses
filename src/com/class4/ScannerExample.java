package com.class4;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
	/*
	 * scanner is a class in Java that will allow us to take an input from a user.
	 * scanner will help us to make our java program more interactive	
	 */
		System.out.println("Please enter any number");
	/*
	 * nextInt(); for number
	 * nextLine(); for strings
	 * nextDouble(); for double numbers
	 */
	int number=new Scanner(System.in).nextInt();
		System.out.println("Entered number is "+number);
	
	Scanner input=new Scanner(System.in);
	System.out.println("please enter your name");
	String name=input.nextLine();
	System.out.println("good afternoon "+name);
	float f = 12345.67894324234f;
	System.out.println(f);
	}
}
