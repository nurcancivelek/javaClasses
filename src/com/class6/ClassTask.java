package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		
	
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your birth month:");
	String month=input.nextLine();;
	String season=null;
	//String season; da olabilir
	
	if(month.equals("January") || month.equals ("February") || month.equals("December")) {
		season="Winter";
	}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
		season="Spring";
	}else if(month.equals("June") || month.equals("July") || month.equals("August")) {	
		season="Summer";
	}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
		season="Fall";
	}else {
		System.out.println("unknown");
	}
	System.out.println("You were born in "+season);
	System.out.println(month);
}
}