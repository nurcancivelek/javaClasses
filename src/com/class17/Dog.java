package com.class17;

public class Dog {
	String name, color, breed;
	int age;
	
	void barks() {
		System.out.println("barks to strangersbut too cute to get mad");
	}
	void trained() {
		System.out.println("also he is trained and well behaved");
	}
	public static void main(String[] args) {
		
	
	Dog husky= new Dog();
	husky.name="Jackoo";
	husky.color="Golden Brown";
	husky.breed="Husky";
	husky.age=1;
	
	System.out.println("I wish i had a "+husky.breed+" dog "+"named"+husky.name);
	husky.barks();
	husky.trained();
	}
}
