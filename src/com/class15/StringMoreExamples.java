package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		//get character at specific position
				//charAt()
		
		String str="Syntax Technologies Inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length()));//index starts from 0.
		//gives exception out of bounds... length is 19 but index is 18...
		System.out.println(str.charAt(str.length()-1));//gives the last letter-->c
		
		//get a substring from a string
		//print Syntax
		String substr1=str.substring(0,6);
		System.out.println(substr1);
		//print technologies
		String substr2=str.substring(7);
		System.out.println(substr2);

	}

}
