package com.class27;

public class FinalKeyword {
	public static final String str="Hello";

	public static void main(String[] args) {
//		
		
		
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";
		//finalstring= "java is hard";--->compiler error
		
		final int age=120;
		//age=100;--->compiler error
		
	
	//final keyword with methods
	}
	
	public final void hello() {
		System.out.println("I am a final method in parent class");
	}
	public final void hello(int num) {
		System.out.println("final method in in parent class with a parameter");
	}

}
class FinalKeywordChild extends FinalKeyword {
	//final method cannot be overriden, we will get ce.
	//public final void hello()
	// sout.....
	//}
	
	
	
	}