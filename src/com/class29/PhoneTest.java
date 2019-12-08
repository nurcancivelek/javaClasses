package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		//you cannot create an object of an abstract class directly
		//Phone phone=new Phone(); CE cannot 

		//we can create it  indirectly
		
		Phone phone=new Iphone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
		
		Phone phone2=new Samsung();
		phone2.makeCall();
		phone2.sendText();
		phone2.takePictures();
		phone2.playGames();
	}

}
