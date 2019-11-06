package com.class5;

import java.util.Scanner;

public class LogicalOr {
	public static void main(String[] args) {
		//7 days a week
		//if days is 2 or 4 --> SDLC class
		//if day is 6 or 7--> Java class
		//if day is 1 or 5 --> no Class
		//if day 3 --> review class
		Scanner scan=new Scanner (System.in);
		int d= scan.nextInt();
		if (d== 2|| d==4) {
			System.out.println(" SDLC class");	
		}else if (d==6 || d==7) {
			System.out.println(" Java class");
		}else if (d==1 || d==5) {
			System.out.println(" no class");
		}else
			System.out.println(" not a valid day");
	}
	
}
