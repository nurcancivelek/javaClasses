package com.class23;

public class Milk {
//	Write a program that will have a constructor:
//	one with parameters and second without any parameters. 
//	Create a separate Test class where you will execute both of the 
//	constructors.

	String brand;
	String type;
	boolean organic;
	
	Milk(String brand1, String type1, Boolean organic1){
		brand=brand1;
		type=type1;
		organic=organic1;
	}
	
	Milk(){
//		System.out.println("This milk is "+brand+", it is "+type+
//				" milk and organic: "+organic);
		
	}
	public void Info() {
		System.out.println("info about the milk: it is "+brand+ ", it is "+type+
				" 's milk and it is organic: "+organic);
	}
	public static void main(String[] args) {
		Milk milk1=new Milk("Horizon", "Cow's", true);
		milk1.Info();
		System.out.println();
		Milk milk2=new Milk();
		milk2.brand="TraderJOes brand";
		milk2.type="Goat's Milk";
		milk2.organic=true;
		
		milk2.Info();
	}
}
