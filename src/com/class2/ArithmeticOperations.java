package com.class2;

public class ArithmeticOperations {
	
	/*
	 * declare 2 variables and initialize them
	 * perform addition, subtraction, multiplication, division
	 * 
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 20;
		num2 = 10;
		
		System.out.println(num1+num2); //30
		System.out.println(num1-num2); //10
		System.out.println(num1*num2); //200
		System.out.println(num1/num2); //2
		
		
		//how can we print value of num1 and num2 together
		
		System.out.println(num1+" "+num2);
		
		int sum = num1+num2;
		int sub = num1-num2;
		int mult = num1*num2;
		int div = num1/num2;
		
		//the addition of 2 numbers is ___
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The addition of 2 numbers is " + sum + ".");
		System.out.println("The subtraction of "+ num1 + "-" + num2 + " is " + sub );
		System.out.println("The multiplication of "+num1 + "*" + num2 + " is " + mult);
		System.out.println("The division of "+num1 + "/" + num2 + " is " + div);

		
		double n1 = 5.3;
		double n2 = 4.4;	
		
		double add = n1+n2;
		double subt = n1-n2;
		double multi = n1*n2;
		double divi = n1/n2;
		
		System.out.println("the addition of 2 numbers " + n1  + " and " + n2 + " is equal to " + add);
		System.out.println("the subtraction of 2 numbers " + n1 + " and " + n2+ " is equal to " + subt);
		System.out.println("the multiplication of 2 number " + n1 + " and " + n2+ " is eaual to " +  multi);
		System.out.println("the division of 2 number " + n1 + " and " + n2+ " is eaual to " +  divi);
		
double c = 3.9*3.9;
		System.out.println("the square of the number 3.9 is  " + c);
		
		int w = 5;
		int h = 8;
		
		int area = w*h;
		int per = (h+w)*2;
		
		System.out.println("the perimeter of a rectangle with width  " + w + " and height "+ h+ " is eaual to " +  per + " and the area System.out.println(is " +area);
	}
}
