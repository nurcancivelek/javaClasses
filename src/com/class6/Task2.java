package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to find largest of three double values
		//using if-else..if and logical operators provided by a user 
		//(numbers must be distinct)
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter three numbers:");
		double a= scan.nextDouble();
		double b= scan.nextDouble();
		double c= scan.nextDouble();
		
		if(a>b && a>c) {
			System.out.println(a+ " is the largest number");
		}else if (b>a && b>c) {
			System.out.println(b+ "is the largest number");
		}else {
			System.out.println(c+ "is the largest number");
		}
		//Program to find largest number among three numbers 
		//using nested if provided by a user (numbers must be distinct)
		System.out.println("Please enter three numbers:");
		int d= scan.nextInt();
		int e= scan.nextInt();
		int f= scan.nextInt();
		if(d>e && d>f) {
			System.out.println(d+ "is the largest number");
		}else if(e>d && e>f) {
			System.out.println(e+ "is the largest number");
		}else {
			System.out.println(f+ "is the largest number");
		}
		scan.close();
	}

}
