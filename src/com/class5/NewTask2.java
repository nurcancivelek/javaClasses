package com.class5;

import java.util.Scanner;

public class NewTask2 {
	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//short (under 5 feet)
		//medium(5 to 6 feet)
		//tall (6 feet and over)
		Scanner input=new Scanner(System.in);
		System.out.println("your height??");
		int height=input.nextInt();
		if(height<5) {
			System.out.println("short");
		}else if(height>=5 && height<=6) {
			System.out.println("medium");
		}else if(height>6) {
			System.out.println("tall");
		}
	}
}
