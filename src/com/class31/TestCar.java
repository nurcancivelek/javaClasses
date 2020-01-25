package com.class31;

public class TestCar {

	public static void main(String[] args) {
        Car car1=new Sedan(15000, "black",15);
        System.out.println(car1.calculateSalePrice());
        Car car2=new Truck(20000,"white",1500);
        System.out.println(car2.calculateSalePrice());
    }

}
