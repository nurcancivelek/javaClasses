package com.class_25;

public class Task2 {
	
	
//	Create 1 class with a static method that has 3 overloaded forms.
//	Then call each overloaded method with specific arguments and observe result.

	public static void overLoaded() {
			System.out.println("No parameters");
	}
	public static void overLoaded(int num) {
		System.out.println("with 1 int parameter: "+ num);
	}public static void overLoaded(String str) {
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		Task2 oreo=new Task2();
		oreo.overLoaded();
		oreo.overLoaded(5);
		oreo.overLoaded("as of now : OverLoaded");
		
	}
	
}
