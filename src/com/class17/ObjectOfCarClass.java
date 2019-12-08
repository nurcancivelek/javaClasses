package com.class17;

public class ObjectOfCarClass {
	public static void main(String[] args) {
		
		//to create an object syntax is
		//classname variable=new classname();
		//Sccaner scan=new Scanner(System.in)
		//String str=new String();
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		//accessing behavior for 1 object
		car1.drive();
		car1.start();//calling method start from class car
		car1.accelerate();
		
		System.out.println("-------------");
		
		Car car2=new Car();
		car2.make="BMW";
		
		
		car2.model="X5";
		car2.color="Black";
		car2.year=2020;
		car2.wheels=4;
		car2.windows=5;
		car2.speed=200;
		car2.drive();
		car2.start();
		car2.accelerate();
		
		System.out.println("I have "+car1.color+ " "+car1.year+ " "+car1.make+" "+car1.model);
		System.out.println("I want to drive a "+car1.make+" "+car1.model+" "+"in any color!");
		
	}

}
