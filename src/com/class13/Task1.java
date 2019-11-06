package com.class13;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your class day: ");
		String day=scan.nextLine();
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your java class");
		}else if(day.trim().equalsIgnoreCase("sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.trim().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");	
		}if(day.trim().toLowerCase().equals("thursday")) {
			System.out.println("Thursday is your Manual Testing class");	
		}else {
			System.err.println("Invalid enrty! Please enter a valid day");
		}
		scan.close();
	}

}
