package com.class32;

 interface Shape {
//	Create  an  Interface  'Shape'  with  undefined methods
//	as calculateArea and calculatePerimiter.  Create  2  classes
//	Circle  & Square that implements functionality defined in the
//	Shape Interface. Test your code.

	void calculateArea();
	void calculatePerimeter();
}
class Circle implements Shape{
	int radius=5;
	@Override
	public void calculateArea() {
		System.out.println(3.14*radius*radius);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println(2*3.14*radius);
		
	}
	
}
class Square implements Shape{
	int length=12;
	@Override
	public void calculateArea() {
		System.out.println(length*length);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println(length*length*length*length);
		
	}
	
}






