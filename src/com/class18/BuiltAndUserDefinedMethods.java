package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		//built in
		String str="Hello";
		str.replace("Hello","Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		scan.nextLine();//a method in Scanner class
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}
	void myMethod() {
        System.out.println("This is defined method that I created");

}}
