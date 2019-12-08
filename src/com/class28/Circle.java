package com.class28;

public class Circle extends Shape{

	Circle(int radius){
		super(radius);
	}
	void areaCircle() {
		System.out.println(3.14*super.radius*super.radius);
	}
	public static void main(String[] args) {
		Circle obj=new Circle(8);
		obj.areaCircle();
	}
}
