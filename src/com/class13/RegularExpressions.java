package com.class13;

public class RegularExpressions {
	
	public static void main(String[] args) {
		
		//print only text and not numbers
		
		String str= "1234hel4567lo56564645";
		System.out.println(str.replaceAll("[0-9]", ""));
		
		String strs = "1212314H465456ell46546o";
        System.out.println(strs.replaceAll("[0-9]","")); // Leave only text
        System.out.println(strs.replaceAll("\\d", ""));
		
		//print only number and no text
		System.out.println(str.replaceAll("[a-zA-Z]",""));
		
		//remove everything except text and numbers
		String str2="Hi#$%How#$%4321";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
		System.out.println("-------");
		//prints only non numeric/alphabetic characters:$%^
		System.out.println(str2.replaceAll("\\w", ""));
		System.out.println();									
		
		// \\s  space i replace eder
		String star= "Hello how are you";
		System.out.println(star.replaceAll("\\s",""));
		
		//replace non numeric non alphabetic caharacters
		String str1="04-01-1981";//04/01/1981
		System.out.println(str1.replace('-','/'));
		System.out.println(str1.replace("-","/"));
		System.out.println(str1.replaceAll("-","/"));
		
		
	}

}
