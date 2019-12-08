package com.class29;

public abstract class Vehicle {
	//this class is 50% defined 
    public void drive() {
        System.out.println("To drive the car you should press the gas");
    }
    public void stop() {
        System.out.println("To stop the car you should press the break");
    }
    public abstract void start();
    public abstract void Performance();
}
abstract class Car extends Vehicle{//this class is 75% defined/
    public void start() {
        System.out.println("It starts by start botton");
    }
    public abstract void door();
}
class BMWi8 extends Car{//this class is 10% defined so we can create object of this class
    @Override
    public void Performance() {
        System.out.println("Performance of the BMW i8 is 4.4 seconds");
        
    }
    @Override
    public void door() {
        System.out.println("it has 2 doors");
        
    }


}
