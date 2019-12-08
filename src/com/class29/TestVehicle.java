package com.class29;

public class TestVehicle {
	public static void main(String[] args) {
        Car bmw=new BMWi8();
        bmw.drive();
        bmw.stop();
        bmw.start();
        bmw.Performance();
        bmw.door();
        System.out.println();
        Vehicle bmw1=new BMWi8();
        bmw1.drive();
        bmw1.stop();
        bmw1.start();
        bmw1.Performance();
        //bmw1.door(); --> this is not available because it belongs to the parent 
        //class but our object is referred to grandparent class
        
    }

}
