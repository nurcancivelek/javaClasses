package com.class24;

public class Apple extends Fruit{
	
	
	public void crisp() {
		name="apple";
		System.out.println(name+"s are crisp!");
	}

	public static void main(String[] args) {
		Food food1=new Food();
		food1.isHealthy();
		food1.name="Banana";
		food1.season="Summer";
		food1.info();
		System.out.println("--------------");
		
		Fruit fruit1=new Fruit();
		fruit1.name="Strawberry";
		fruit1.season="Summer";
		fruit1.info();
	
		System.out.println("----------");
		Apple apple= new Apple();
		apple.crisp();
		apple.sweet();
		apple.info();
	
	}
	
}
