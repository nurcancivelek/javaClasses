package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
//		String brand, color, keyboard; 
//		boolean touchScreen,duet; 
//		int storage, ram;

		Computer computer1=new Computer();
		computer1.brand="Apple";
		computer1.name="MacBookPro";
		computer1.color="Pink";
		computer1.keyboard=true;
		computer1.touchScreen=true;
		computer1.twoInOne=true;
		computer1.storage=250;
		computer1.ram=9;
		computer1.screen=17;
		
		System.out.println("i have "+computer1.brand+"in "+computer1.color);
		
		
		
		
	}

}
