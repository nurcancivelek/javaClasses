package com.class9;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for (int j=0; j<=5; j++) {
				System.out.println(i+"-"+j);
			}
		}
		
		//*
		//**		5 rows and 5 column
		//***
		//****
		//*****
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//*
				//**		5 rows and 5 column 1
				//***							12
				//****							123
				//*****
				for(int i=1; i<=5; i++) {
					for (int j=1; j<=i; j++) {
						System.out.print(j);
					}
					System.out.println();
	}
				
				//*
				//**		5 rows and 5 column 1
				//***							22
				//****							333
				//*****
				for(int i=1; i<=9; i++) {
					for (int j=1; j<=i; j++) {
						System.out.print(i);
					}
					System.out.println();		
				
				}
		int k=1;		
		for(int a=5; a>1; a--) {
			for(int b=1; b<((10-k)/2); b++) {
				System.out.print(" ");
			}
			for(int i=0; i<k; i++) {
				System.out.print("*");
			}
			//
		
		k+=2;
		System.out.println("");
		}
		System.out.println("************************");
	
		for(int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------");
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int c=4; c>=1; c--) {
			for(int d=1; d<=c; d++) {
				System.out.print("*"); // asagiya dogru inerken decrement yapinca kod boyle olmali
			}
			System.out.println();
		}
		
		
		
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the 
		//even and odd integers.
		

		//Write a guessing game where the user has to guess a secret number between 1 and 20.
		//After every guess input, the program tells the user whether their number 
		//was too large or too small. The program will keep asking the user to enter
		//the number until he finds the correct number.
		//When the correct answer is found the system should display 
		//“Congratulations!!. You got it!”

	}
}
