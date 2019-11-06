package com.class5;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		//Write a program to find largest of three double values 
		//using if-else..if and logical operators provided by a user (numbers must be distinct)
		
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Which one is the largest number?");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		//double result=scan.nextDouble();
		
		if(num1>num2  && num1>num3) {
			System.out.println(num1+  " is the largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+  " is the largest number");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+  " is the largest number");
		}
	}
}

		
	

