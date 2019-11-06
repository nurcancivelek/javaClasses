package com.class5;

import java.util.Scanner;

public class HomeWork3 {

	//Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
	//and determine the grade based on the following rules: 
	//if the average score >=90 → grade=A
	//if the average score >= 70 and <90 → grade=B
	//if the average score>=50 and <70 → grade=C
	//if the average score<50 → grade=F
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
			System.out.println("Please enter your quiz score");
			int quiz=a.nextInt();
		
			System.out.println("Please enter your midterm score");
			int midterm=a.nextInt();
		
			System.out.println("Please enter your final score");
			int finals=a.nextInt();
		
			int average=((quiz+midterm+finals) /3);
		
			if(average>=90) {
				System.out.println("you got an A! Good job!");
			}else if(average>=70 && average<90) {
			System.out.println("you got a B!");
			}else if(average>=50 && average<70)	 {
			System.out.println("you got a C!");
			}else if(average<50) {
			System.out.println("you got a F!");
		}
	}
}
