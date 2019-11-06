package com.class6;

import java.util.Scanner;

public class HomeWork23 {

	public static void main(String[] args) {
		
		//3.HomeWork: Using scanner class create calculator.
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double num1=scan.nextInt();
		System.out.println("Please enter the operator:");
		char operator=scan.next().charAt(0);
		System.out.println("Please enter the second number:");
		double num2=scan.nextInt();
		
		
		if(operator=='+') {
			System.out.println(num1+num2);
		}else if(operator=='-') {
			System.out.println(num1-num2);
		}else if(operator=='*') {
			System.out.println(num1*num2);
		}else if(operator=='/')	 {
			System.out.println(num1/num2);
		}
	}
}// try this with switch statement, derste yapildi

