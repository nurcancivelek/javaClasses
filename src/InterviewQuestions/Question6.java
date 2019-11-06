package InterviewQuestions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to find whether a String is palindrome or not?
		String original, reverse = ""; // Objects of String class
	    Scanner scan = new Scanner(System.in);
	 
	    System.out.println("Enter a word pls");
	    original = scan.nextLine();
	 
	    int length = original.length();
	 
	    for (int i = length - 1; i >= 0; i--)
	      reverse = reverse + original.charAt(i);
	 
	    if (original.equals(reverse))
	      System.out.println("The string is a palindrome.");
	    else
	      System.out.println("The string isn't a palindrome.");
	}

}
