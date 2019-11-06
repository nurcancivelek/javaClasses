package com.class3;

public class TemperatureCheck {
	
	public static void main(String[] args) {
		
		int storeTemperature= 33;
		if(storeTemperature<32) {
		System.out.println("Water will freeze with temperature " + storeTemperature);
		}else {
		System.out.println("Water will NOT freeze with temperature " +storeTemperature);
		}
	
		int num1=99;
		int num2=100;
		
		if (num1==num2)  {
		System.out.println("Numbers are NOT equal");
		}
	
	boolean val=true;
	if(val) {
	System.out.println("Hello");
	}else {
		System.out.println("bye");
	}
	boolean isRain=false;
	if(isRain) {//isRain=true
		System.out.println("I will take umbrella");
	}else {
		System.out.println("I go for a walk");
	}
	
	
	}
	
	
	
}