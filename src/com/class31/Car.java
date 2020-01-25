package com.class31;

public class Car {

	double carPrice;
    String color;
    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    double calculateSalePrice() {
        return carPrice;
    }
}
class Sedan extends Car {
    int length;
    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length=length;
    }
    
    double calculateSalePrice() {
        if (length > 20) {
            carPrice = carPrice - .05 * carPrice;
        } else {
            carPrice = carPrice - .1 * carPrice;
        }
        return carPrice;
    }
}
class Truck extends Car {
    double weight;
    Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice - .1 * carPrice;
        } else {
            carPrice = carPrice - .2 * carPrice;
        }
        return carPrice;
    }

}
