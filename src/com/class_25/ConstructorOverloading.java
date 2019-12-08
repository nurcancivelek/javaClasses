package com.class_25;

public class ConstructorOverloading {
//different amount of parameters
	ConstructorOverloading(){
		System.out.println("I am a non argument constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am a constructor with one String parameter");
	}
	//having different types of parameters
	ConstructorOverloading(int num){
		System.out.println("I am a constructor with 1 int parameter");
	}
}
