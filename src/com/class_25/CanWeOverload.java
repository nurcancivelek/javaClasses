package com.class_25;

public class CanWeOverload {
	
	//can we overload a private method??

	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	//can we overload a main method?-->> YESS!!!
	//can we overload a static method???-->> yESS
	public static void main(String str) {
		System.out.println("i am a main methos with String arguments");
	}
	public static void main(String str, String[] arg) {
		System.out.println("i am a main method with 2 parameters");
	}
	
	//this is the only main method to print
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
//		CanWeOverload.main("String");
//		String[] array= {"A","B"};
		//main.("Hello", array);
		
		CanWeOverload canWe= new CanWeOverload();
		canWe.methodOne();
	
	}
}
