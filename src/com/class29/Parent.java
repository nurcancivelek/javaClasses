package com.class29;

public class Parent {//Repl170

	String city;
	Parent(String city){
	  this.city=city;
	}
	public void display(String string){
	  System.out.println("City name "+city);
	}
}
class Child extends Parent{
	  Child(String city){
	    super("Fairfax");
	    
	  }
	}