package com.class26;

public class Animal {
	
	public void sleep() {
		System.out.println("Animals sleep");
	}
	public void eat() {
		System.out.println("animals eat");
	}
}
class Cat extends Animal {
	
	public void sleep() {
		System.out.println("Cats sleep all day");
	}
	public void meow(){
		System.out.println("I meow whwn i am hungry");
	}
	public void eat() {
		System.out.println("Cat eats mouse");
	}
}