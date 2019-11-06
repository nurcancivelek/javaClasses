package com.class5;

import java.util.Scanner;

public class OrwithString {

	public static void main(String[] args) {
		//7 days a week
		//if days is 2 or 4 --> SDLC class
		//if day is 6 or 7--> Java class
		//if day is 1 or 5 --> no Class
		//if day 3 --> review class
		Scanner scan=new Scanner(System.in);
		String d=scan.nextLine();
		if (d.equals ("Tuesday")|| d.equals("Thursday")) {
			System.out.println(" SDLC class");	
		}else if (d.equals("Saturday") || d.equals("Sunday")) {
			System.out.println(" Java class");
		}else if (d.equals("Monday") || d.equals("Friday")) {
			System.out.println(" no class");
		}else if(d.contentEquals("Wednesday")) {
			System.out.println(" review day");	
		}else
			System.out.println(" not a valid day");
		
	}
	
}

