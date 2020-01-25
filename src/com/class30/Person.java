package com.class30;

interface Person {
	void run(); //abstract method)
	void walk();
	
}
class A implements Person {
	public void run() {
		System.out.println("Run fast");
	}
	public void walk() {
		System.out.println("walk everyday");
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.run();
		obj.walk();
		System.out.println("ee");
		
	}
}
