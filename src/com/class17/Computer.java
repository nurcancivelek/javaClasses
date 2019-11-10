package com.class17;

public class Computer {

	//define features/attributes
	String brand, name, color; 
	boolean touchScreen,twoInOne, keyboard; 
	int storage, ram, screen;
	//define behavior/ actions-->method()
	
	void playGames() {//method header
		//method body
		System.out.println("I can play on my "+name);
	}
	void javaCoding() {
		System.out.println("I can do Java coding on my "+brand+" "+name);
	}
	void watchMovie() {
		System.out.println("I can watch movies on my "+name);
	}
	void duet() {
		System.out.println("my kids can play  with it as well");
	}
	/////////////////////////////////////////
	//using main method to execute the codes
	public static void main(String[] args) {//this method makes our code executable
	//only when there is code inside this main method	
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBookPro";
		comp1.storage=250;
		comp1.color="Rose Gold";
		
		System.out.println("I have an "+comp1.brand+" "+comp1.name+" in "+comp1.color);
		comp1.javaCoding();//we are calling this method 
		comp1.watchMovie();
		
		System.out.println("------Creating a second object of a computer type----");
		Computer comp2=new Computer();
		comp2.brand="Microsoft";
		comp2.name="Surface";
		comp2.storage=250;
		comp2.twoInOne=true;
		comp2.touchScreen=true;
		System.out.println("I have a "+comp2.brand+" "+comp2.name+" laptop.");
		comp2.javaCoding();
		//comp2.watchMovie();
		comp2.duet();
		
		
		
		
		
		
		
		
	}
}
