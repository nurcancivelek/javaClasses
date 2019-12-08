package com.class21;

public class localInstance {
	
	int number=12;
	
	void print() {
		//number=13;
		System.out.println(number);
	}

	public static void main(String[] args) {
		localInstance m=new localInstance();
		m.print();
	}
}
