package com.class4;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("what is the celcious temperature and city?");
		int celtemp=keyboard.nextInt();
		String city=keyboard.nextLine();
		System.out.println("the temperature for " +city+ " is "+ celtemp+ " celcius" );
		int fahtemp= (celtemp * 9)/5 + 32;

		System.out.println("the temperature for " +city+ " is "+ fahtemp+ " fahrenheit" );
	}
	

}
