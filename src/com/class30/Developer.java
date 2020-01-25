package com.class30;

interface Developer {

	void sip();
}
interface Manager{
	void show();
}
class Employee implements Developer, Manager {

	@Override
	public void show() {
		System.out.println("Hello good morning");
	}

	@Override
	public void sip() {
		System.out.println("how are you?");
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.sip();
		obj.show();
	}
}