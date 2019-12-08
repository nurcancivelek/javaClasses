package com.class27;

public class Studentt {
//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism
	
	public void study() {
		System.out.println("all Students : Study!");
	}
	public void practice() {
		System.out.println("All students : Practice!!");
	}
	private void doHomeWork() {
		System.out.println("do your homework!!");
	}
	protected void research() {
		System.out.println(" Research Research Research!");
	}
	void attendClasses() {
		System.out.println("Attend  your classes!!");
	}
	
}
class SyntaxStudent extends Studentt{
	public void study() {
		System.out.println("attn Syntax students: Study more and more!!");
	}
	public void practice() {
		System.out.println("attn Syntax students: You have to practice more !");
	}
	protected void research() {
		System.out.println(" Syntax students have to research a lot!!!!");
	}
	protected void attendClasses() {
		System.out.println("you can't miss your classes!!");
	}
	private void doHomeWork() {//no overriding with private, cannot be inherited to another class
		System.out.println("Syntax Students do homework!!");
	}
}
class CollegeStudent extends Studentt {
	public void study() {
		System.out.println("college students : Study and have fun!");
	}
}
class SchoolStudent extends Studentt{
	public void study() {
		System.out.println("School students: Study and relax!!");
	}
	public void haveTime() {
		System.out.println("school students: no panic you are too young!");
	}
	public void attendClasses() {
		System.out.println("it is ok to miss your classes once or twice a year!!");
	}
}

