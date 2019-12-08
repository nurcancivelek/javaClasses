package com.class17;

public class Dog {
	String name, color, breed;
	int age;
	
	void barks() {
		System.out.println("he barks to strangers but too cute to get mad");
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
	
	Dog bulldog=new Dog();
	bulldog.name="Monster";
	bulldog.color="Black";
	bulldog.breed="Bulldog";
	bulldog.age=10;
	
	System.out.println("I don't have a "+bulldog.breed+" dog "+"named"+bulldog.name);
	
	bulldog.barks();
	bulldog.trained();
	
	Dog labrador= new Dog();
	labrador.name="Jackoo";
	labrador.color="Golden Brown";
	labrador.breed="Husky";
	labrador.age=1;
	
System.out.println("I don't have a "+labrador.breed+" dog "+"named"+labrador.name);
	
	labrador.barks();
	labrador.trained();
	}
}
