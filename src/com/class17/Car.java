package com.class17;

public class Car {

	//define attributes /features of the car
	
	String model, make, color;
	int year, wheels, windows, speed;
	
	//adding behavior/action-->methods
	
	void drive() {
		System.out.println("method drive");
		System.out.println("Car "+make+"  can drive");
	}
	void start() {
		System.out.println("Car "+make+" can start");
	}
	void accelerate() {
		System.out.println("Car "+make+" can accelerate");
	}
}
