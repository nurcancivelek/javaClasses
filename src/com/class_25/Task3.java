package com.class_25;

public class Task3 {

//	Create 1 class with a private method that has 3 overloaded forms.
//	Then call each overloaded method with specific arguments and observe result.
	
	private void forms() {
		System.out.println("form 1; no no parameters!");
	}
	private void forms(int num) {
		System.out.println("form 2, adding an int:  "+num);
	}
	private void forms(String str) {
		System.out.println("form 3, adding a String: "+str);
	}
	
	public static void main(String[] args) {
		Task3 call=new Task3();
		call.forms();
		call.forms(5);
		call.forms("Hello");
	}
	}

