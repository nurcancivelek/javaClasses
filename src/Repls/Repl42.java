package Repls;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {
//		Write a program to input number "Input a number between 1-12" and 
//		when you input a number it should display the month 
//		using Scanner and Switch statement.
//		case: 1 will display January
//		case: 12 will display December
//		Anything outside of 12 will display "Invalid"
		
		int month;
		String result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number between 1-12");
		month=scan.nextInt();
		
			switch(month) {
				case 1: result="January";
				break;
			case 2: result="February";
				break;
			case 3: result="March";
				break;
			case 4: result="April";
				break;
			case 5: result="May";
				break;
			case 6: result="June";
				break;
			case 7 : result="July";
				break;
			case 8: result="August";
				break;
			case 9: result="September";
				break;
			case 10 : result="October";
				break;
			case 11 : result="November";
				break;
			case 12 : result="December";
				break;
			default : result="Invalid";
				break;
			}
			
			System.out.println(result);
	}
}
