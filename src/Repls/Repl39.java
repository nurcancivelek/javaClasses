package Repls;

import java.util.Scanner;

public class Repl39 {
	public static void main(String[] args) {
		//By using the switch statement concept please validate what 
		//is the responsibility each instructor in the syntax solution.

		//First Output: "Enter name of the instructor"

		//case 1: if User provided the name as Shiva as 
		//input it should show  "Will take care of Java Assignment"
		//case 2: if User provided the name as Sandish as input 
		//it should show  "Will take care of SDLC Assignment"
		//case 3: if User provided the name as Weqas as input 
		 //it should show  "Will take care of Selenium Assignment"
		//case 4: if User provided the name as Asel as input 
		 //it should show  "Will take care of every Assignment"
		//Other than these four names if user provide the name 
		 //try to give like (James or John ) " Invalid instructor selected"
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter name of the instructor");
//	String instructor=scan.nextLine();
//	Switch(instructor) {
//		case: "Shiva";
//		System.out.println(instructor+ "Will take care of Java Assignment");
//		break;
//	}
		String instructor, teaches;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter name of the instructor");
	instructor=scan.nextLine();
	switch(instructor) {
	case"Shiva":
		teaches="Java";
		System.out.println(" Shiva teaches "+teaches);
		break;
	case "Sandish":
		teaches="SDLC";
		System.out.println(" Sandish teaches "+teaches);
		break;
	case "Weqas":
		teaches="Selenium";
		System.out.println(" Weqas teaches "+teaches);
		break;
	case "Asel":
		teaches="every Assignment";
		System.out.println(" Asel teaches "+teaches);
		break;
	default :
		teaches="invalid";
		System.out.println( "Invalid name");
		break;
	
	}
	scan.close();
	
	}

	
		
		
	}

