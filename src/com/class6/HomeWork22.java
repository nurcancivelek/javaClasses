package com.class6;

import java.util.Scanner;

public class HomeWork22 {
	
	public static void main(String[] args) {
		
		//2.Allow user to enter grade and then provide explanation:
		//A-Excellent, B-Good, C-Average,D-Bad, any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered 
		//by a user with explanation.
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your grade:");
	char grade=scan.next().charAt(0);
	String explanation;
	
	switch(grade) {
	case 'A':
		explanation="Excellent";
		break;
	case 'B':
		explanation="Good";
		break;
	case 'C':
		explanation="Average";
		break;
	case 'D':
		explanation="Bad";
		break;
		default:
		explanation="Not Acceptable";	
	}
		System.out.println("You got a " +grade+ ". "+ "It is "+ explanation+ "!");
	
	}
}
