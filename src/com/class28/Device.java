package com.class28;

public class Device {
	
	//create device class then create child class apple

	String deviceType, name;
	public Device(String deviceType,String name) {
		this.deviceType=deviceType;
		this.name=name;
	}
}
class Apple extends Device{
// you can aoutomatically click the red line under the Word Apple and the constuctor will come.
	public Apple(String deviceType, String name) {
		super(deviceType, name);
	}
	public void Display(int instock) {
		System.out.println(deviceType+" "+name+" "+"There are "+instock+" in stock");
	}
	
}
