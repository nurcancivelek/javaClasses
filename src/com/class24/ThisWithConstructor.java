package com.class24;

public class ThisWithConstructor {
		
	ThisWithConstructor(){
		System.out.println("i am non argument constructor");
	}
	ThisWithConstructor(String str){
		this();//used to call current class constructor
		//this(); does not take any parameter, 
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str, String str1){
		this(str);//always MUST be a first statement
		//this(); this() ; in this case it is second statement--> compiler error
		System.out.println("I am a constructor with 2 parameters");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		//can we execute 2 constructor when creating an object????/
		//yes-it can be achieved using this()
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		System.out.println("--------");
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Bye");
		//obj1.
	}
}