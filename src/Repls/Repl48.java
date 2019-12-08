package Repls;

import java.util.Scanner;

public class Repl48 {

	public static void main(String[] args) {
//		Prompt user to input either "M" or "F" as a String "gender" 
//		and input any value as int "age". 
//		You have 2 conditions:
//		If age is above 25, your inner condition, depending 
//		on your gender value, should get either "Woman" or "Man" as an output. 
//		If age is below 25, your inner condition, depending 
//		on your gender value, should get either "Girl" or "Boy" as an output. 
//		Instruction: after you run your code, start inputing your 
//		values without Prompt question to appear. 
//		Hint: your age should not be equal to 25. 	
		
		int age;
		String gender;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		System.out.println("Please enter your gender:m or f?");
		gender=scan.next();
		if(age>=25) {
			if(gender.equalsIgnoreCase("m")) {
				System.out.println("Man");
			}if(gender.equalsIgnoreCase("f")) {
				System.out.println("Woman");
			}
			}else {
			if(age<25) {
				if(gender.equalsIgnoreCase("m")) {
					System.out.println("boy");
				}if(gender.equalsIgnoreCase("f")) {
					System.out.println("girl");
				}else {
					System.out.println("invalid data");
				}
			}
		}
		
		
		
		
		

	}

}
