package com.class9;

import java.util.Scanner;

public class NestedLoopPractice {
	
	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the 
		//even and odd integers.
		Scanner scan=new Scanner(System.in);
		System.out.println(" Pls enter a start number");
		int start= scan.nextInt();
		System.out.println("Pls e0nter an end number");
		int end=scan.nextInt();
		int sumOdd=0;
		int sumEven=0;
			
		for(int a=start; a<=end; a++) {
			if(a%2==1) {
				// odd
				sumOdd+=a;
			}else {
				//even
				sumEven+=a;
			}
		}                                                                                                                                  
		System.out.println(" total of odd numbers: "+sumOdd);
		System.out.println(" total of even numbers: "+sumEven);

			
	}
}

