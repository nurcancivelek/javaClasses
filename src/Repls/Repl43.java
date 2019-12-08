package Repls;

import java.util.Scanner;

public class Repl43 {
	
	public static void main(String[] args) {
//			Prompt user with questions: "Please enter your favorite car make"
//			if user enters  BMW -->  carOrigin = "german car"
//			if user enters  Toyota -->  carOrigin = " japanese car"
//			if user enters  Maserati -->  carOrigin = "italian car"
//			anything else besides those values --> carOrigin = "unknown" 
//			The output of your program should be:
//			"Your favorite car is ___"
		
		String carOrigin, result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		carOrigin=scan.next();
		switch(carOrigin) {
		case "BMW" : result="German car";
		break;
		case "Toyota" : result="Japanese car";
		break;
		case "Maserati" : result="Italian car";
		break;
		default : result="unknown";
		
		}
		System.out.println("Your favorite car is "+result);
		
	}

}
