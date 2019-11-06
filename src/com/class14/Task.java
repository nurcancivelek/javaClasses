package com.class14;

public class Task {
	public static void main(String[] args) {
		//create a String that will hold a sentence.
		//Write a program to get a new String without any spaces.
		
		String str="Today is Sunday.";
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));	
		
		//Create a String that should be combination of letters, 
		//numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String str1= "9876$%^5Wha**^&t432to123type";
		System.out.println(str1.replaceAll("\\w", "" ));
		String str2=(str1.replaceAll("[^A-Za-z]", ""));
		System.out.println(str2.length());

		//You have a String a=”Is it saturday? Is it raining?
		//Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array=a.split("\\?");
		System.out.println(array.length);
		
	}

}
