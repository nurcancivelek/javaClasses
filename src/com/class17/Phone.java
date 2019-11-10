package com.class17;

public class Phone {

	String brand, name, model, color; 
	boolean touchScreen; 
	int storage, memory;
	
	void call() {
		System.out.println("I can make call on my "+name);
	}
	void checkMails() {
		System.out.println("I can check my emails from my "+name);
	}
	void surfInternet() {
		System.out.println("I can surf internet in my "+name);
	}
	
	public static void main(String[] args) {
		
	
	Phone phone1=new Phone();
	phone1.brand="Apple";
	phone1.name="IPhone";
	phone1.model="Iphone11 Pro Max";
	phone1.memory=256;
	
	System.out.println("I have "+phone1.name+" "+phone1.model+" "+" and i love it");
	phone1.call();
	phone1.checkMails();
	phone1.surfInternet();
	
	
	Phone phone2=new Phone();
	phone2.brand="Samsung";
	phone2.model="Galaxy s10";
	
	System.out.println("I have "+phone2.brand+" "+phone2.model);
	phone2.call();
	
	Phone phone3=new Phone();
	phone3.name="Google";
	phone3.model="Pixel";
	phone3.memory=128;
	
	System.out.println("I have "+phone3.name+" "+phone3.model);
	phone3.call();
	phone3.surfInternet();
	
	}
}
