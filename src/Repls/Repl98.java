package Repls;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
//		You have Scanner class to input string value. 
//
//		If language is Java it should print the: 
//		"Java is a programming language".
//
//		If language is C it should print the:
//		"C is a procedural programming language"
//
//		If language is C++ it should print the:
//		"C++ is a middle-level programming language"
//
//		If any other should print:
//		"Doesn't match any programming language"

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language=sc.nextLine();
		if(language.equalsIgnoreCase("java")) {
			System.out.println("Java is a programming language");
		}else if (language.equalsIgnoreCase("c")) {
			System.out.println("C is a procedural programming language");
		}else if (language.equalsIgnoreCase("c++")) {
			System.out.println("C++ is a middle-level programming language");
		}else {
			System.out.println("Doesn't match any programming language");
		}
		
		//REPL99
//		If browser is ChRoME it should print the: 
//			"Proceed with Chrome browser"
//
//			If browser is FireFOX it should print the: 
//			"Proceed with Firefox browser"
//
//			If browser is IE it should print the:
//			"Proceed with IE browser"
//
//			If any other browser it should print the:  
//			"Invalid browser"
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine(); 
		if(browser.equalsIgnoreCase("ChRoMe")) {
			System.out.println("Proceed with Chrome browser");
		}else if (browser.equalsIgnoreCase("FireFOX")) {
			System.out.println("Proceed with Firefox browser");
		}else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Proceed with IE browser");
		}else {
			System.out.println("Invalid browser");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   
	}
	
}
