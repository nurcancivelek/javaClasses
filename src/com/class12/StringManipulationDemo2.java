package com.class12;

public class StringManipulationDemo2 {
	
	public static void main(String[] args) {
		
		//.contains();
		//this method searches the sequence of characters in the string.
		//if the sequences of characters are found,
		//then it returns true otherwise returns false
		
		
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		System.out.println(sentence.contains("was"));//true
		System.out.println(sentence.contains("Was"));//case sensitivity var
		System.out.println(sentence.contains("w"));

		//create two strings and initialize them with some value.
		//implement the following methods on those strings.
		//sen.length();
		//sen.equals();
		//sen.contains();
		//se.toUpperCase();
		//sen.toLowerCase();
		//sen.equalsIgnoreCase(anotherString);
		
		String sen1="Today is Sunday";
		String sen2= "Today is Java day";
		System.out.println(sen1.length());
		System.out.println(sen2.length());
		System.out.println("-------");
		
		System.out.println(sen1.equals(sen2));
		System.out.println(sen1.equalsIgnoreCase(sen2));
		System.out.println("-------");
		
		System.out.println(sen1.toLowerCase());
		System.out.println("--------");
		
		System.out.println(sen2.toUpperCase());
		System.out.println("--------");
		
		System.out.println(sen1.contains(sen1));
		System.out.println("--------------");
		
		//this method tests if a string starts with the
		//specified prefix beginning
		String str2= "It is very hot in the class";
        System.out.println("Is this string starts with " + str2.startsWith("It"));
        //System.out.println("Is this string starts with " + str2.startsWith("is", 3));
    System.out.println("_______________________");
        

		
		//this method tests if a string ends with the
		//specified suffix 
  //This method tests if this string ends with the specified suffix
    System.out.println("Is this string starts with = " + str2.endsWith("class"));

	}

}
