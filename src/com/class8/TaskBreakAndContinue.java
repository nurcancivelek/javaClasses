package com.class8;

import java.util.Scanner;

public class TaskBreakAndContinue {
	public static void main(String[] args) {
		
		//print numbers from 1-50 except those are divisible by 3
		
		
		for(int a=1; a<=50; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.print(a+ " ");
		}
		System.out.println();
	//apply for a credit card for 10 times
	Scanner scan=new Scanner(System.in);
	
	
	for(int b=1; b<=10; b++) {
		System.out.println("would you like to apply for a credit card");
		String answer=scan.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			break;
		}
				
				
	
	
	
	
	}
	}
}
