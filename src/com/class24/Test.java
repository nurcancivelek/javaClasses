package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 child1=new Child1();
		System.out.println(child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parent parent= new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sing();
		//parent.code(); compiler error: not inherits coding from the child1 class
		
		Child2 child2=new Child2();//name
		System.out.println(child2.hairColor);
		child2.eyeColor="Blue";
		System.out.println(child2.eyeColor);
		child2.sing();
		child2.canSurf();
	}
}
