package com.class12;

public class StringManipulationDemo {// STRING DEN BASLADIK
	
	public static void main(String[] args) {//.LENGTH METHOD
		
		//there are two ways to create string objects:
		
		//1 way
		//string literal
		String name= "John"; //CHARACTER SAYISI 4;.LENGTH 4 OLUR
		System.out.println(name);
		System.out.println(name.length());
		
		//2 way
		//creating string with new key word
		String name1= new String ("John1");
		System.out.println(name1);
		
		/*
		 * this method returns the length of this string.
		 * the length is equal to the number of
		 * 16 bit Unicode characters in the string
		 */
		
		int name1Len=name1.length();
		System.out.println("the length of name1Len is= "+name1Len);
	
		//.toLowerCase
		//LOWERCASE METHOD hepsini lower case e cevirmek
		String str1= "Hello WoRld";
		System.out.println("before:: "+str1);
		str1=str1.toLowerCase();
		System.out.println("after;; "+str1);
	
		System.out.println("============");
	
	//.equals()
		//this method will count/compare everything such as
		//capitalization and content
	String str2= "HeLlo WoRlD";
	boolean isEqual=str1.contentEquals(str2);
	System.out.println(isEqual);
	
	//.equalsIgnoreCase()
	//this method does not care for capitalization and
	//compare the content only
	System.out.println(str1.equalsIgnoreCase(str2));
	
	//UPPERCASE hepsini upper case e cevirmek
	//this method  converts all of the characters in 
	//this string to upper case
	String str3= "Muhammad";
	System.out.println("before: "+str3);
	str3=str3.toUpperCase();
	System.out.println("after; "+str3);
	}

}
