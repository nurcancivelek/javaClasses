package com.class1;

public class Greetings {
	
	public static void main (String[] args) {
//println vs print
		
		System.out.println ("Good morning");
		
		System.out.print ("Good afternoon");
		
		System.out.println ("Good evening");
		
		System.out.print("Good night");
		
		System.out.println ("I am going to sleep");
		
		//swap numbers
		int a= 5;
		int b=4;
		
		 a=a+b;//5+4=9
		 b=a-b;//9-4=5
		 a=a-b;//9-5=4
		 //a=4
		 //b=5
		
		 //swap strings
		 
		 String x="Hello";
		 String y="Welcome";
		 x=x+y;//HelloWelcome
		 y=x.substring(0,(x).length()-y.length());
		 x=x.substring(y.length());
		 System.out.println(x);
		 System.out.println(y);
		 
	}
}