package com.class_25;

public class Addition {
	//method overloading
	//1 by passing different amount of parameters
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	//2 by having different types of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public double add(int num1, double num2) {
		double sum=num1+num2;
		return sum;
		//System.out.println(num1+num2);//void olsa print etmek icin kullanirdik
	}
	public void add(double num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		obj.add(2.1, 13.1);
		obj.add(5, 2.5);
		obj.add(2.9, 13);
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
		
	}

	
	
}
