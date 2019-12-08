package com.class_25;

public class Programming {

//	Create a class named ‘Programming’. 
//	While creating an object of the class, if nothing is passed to it,
//	then the message “I love programming languages” should be printed. 
//	If some String is passed to it, then in place of “programming languages”
//	the value variable should be printed. Example, if we pass “Java”,
//	then “I love Java” should be printed.
	
	public void langs(String str) {
		System.out.println("I love "+str);
		}
	public void langs() {
		System.out.println("I love programming languages");
	}
	public static void main(String[] args) {
		Programming pr=new Programming();
		pr.langs("Java");
		pr.langs();
	}
	}




//if( str=="Java") {
//System.out.println("I love Java! ");
//}else{
//System.out.println("I love programming languages");