package com.class19;

public class Tasks {

//	Create a method createEmail(). Based on provided users name,
//	lastName and email type, your method should return 
//	complete email Address. Example: johnsnow@gmail.com 
//	or johnsnow@yahoo.com*
	
	String CreateEmail(String userName, String lastName, String emailType) {
		String email=userName+lastName+"@"+emailType+".com";
		return email;
	}
	//Write a method to return whether given number is prime or not?
	boolean isPrime(int number) {
		boolean prime=true;
		for(int i=2; i<=number/2; i++) {
			if(number%i==0) {
				prime= false;
				break;
			}
		}
		return prime;
	}
	
	//task 3
	
	public static void main(String[] args) {
		Tasks tt=new Tasks();
		String email=tt.CreateEmail("nurcan","","gmail");
		System.out.println(email);
		boolean prime=tt.isPrime(11);
		System.out.println(prime);
		
	}
	
}
