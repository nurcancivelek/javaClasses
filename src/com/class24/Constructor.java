package com.class24;

public class Constructor {

	void Constructor(){// basina void(empty return type) koyarsak method a donusur
		System.out.println("Hello");
	}
	Constructor(){// basina void(empty return type) koyarsak method a donusur
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor(); //create and instance of the class
	}
}
