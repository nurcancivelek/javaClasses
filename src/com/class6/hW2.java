package com.class6;

import java.util.Scanner;

public class hW2 {

	//1. Ask user to enter their country and capture it.Once 
	//values are captured print which language user speaks.
	
	public static void main(String[] args) {
		String country, language;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your home country:");
		country=scan.nextLine();
		
		switch(country ) {
		case "Turkey":
			language= "Turkish";
			break;
		case "China":
			language="Chinese";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Germany" :
			language= "Deutsch";
			break;
		default:
			language= "unknown";	
		}
		System.out.println("you are from "+country+ " and you speak "+language);
		
	}
}	
	//2.Allow user to enter grade and then provide explanation:
	//A-Excellent, B-Good, C-Average,D-Bad, any other grade --> Not Acceptable.
	//At the end your program should print which grade was entered 
	//by a user with explanation.
	
	//3.HomeWork: Using scanner class create calculator.
	//Allow user to enter 2 numbers and operator(+,-,*,/). 
	//Based on operator provide the result to user.
	
	
	
	
	
	
	
	

