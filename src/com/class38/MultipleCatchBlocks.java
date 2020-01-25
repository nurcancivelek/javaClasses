package com.class38;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		
		division(12,0);
		division(12,2);
		
		System.out.println(10/2);

	}
	public static void division(int num1, int num2) {
		int result;
		
		try {
			result=num1/num2;//new arithmetic exception(
			System.out.println(result);
			Thread.sleep(2000);//new interrupted exception
		}catch(ArithmeticException e){
			System.out.println("Pls do not pass o as a second number");
		}catch(InterruptedException e) {
			System.out.println("someone interrupted program sleep");
		}catch(Exception e) {
			System.out.println("Catching all types of exception");
		}
		System.out.println("end of my code");
		
	}

}
