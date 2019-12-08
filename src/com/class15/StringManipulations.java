package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		//string class comes in java lang package
		
		//2 ways to to create a string
		//first way using string literal
		String str="Hello";
		//second way using new keyword-creating a string object
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		//find the number of characters inside the string
		int length=str.length();
		System.out.println(length);
		//case coversion methods/functions
		str=str.toLowerCase().toUpperCase();//HELLO
		System.out.println(str); //HELLO
		
		//verify if the  string is empty
		String myString="";//empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);//prints true
		//String myString1=null; no value at all 
		//System.out.println(myString1.isEmpty());//prints exception 
		
		//how to verify existence of characters in the string
		String a="Good eveninng students";
		boolean exist=a.contains("students");
		System.out.println(exist);//prints true
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
		
		
	
	}

}
