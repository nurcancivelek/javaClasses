package com.class31;

public class RegistrationTest extends Registration{

	public static void main(String[] args) {
		
		Registration r=new Registration();
		r.getEmail("nurcan@gil.com");
		r.getUserName("nurca");
		r.getPassword("1234");
		
		r.getEmail("nurcan@gmail.com");
		r.getUserName("nurcan");
		r.getPassword("12345678");
	}

}
