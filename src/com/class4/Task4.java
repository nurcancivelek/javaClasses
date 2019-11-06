package com.class4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what's your age?");
		int age = keyboard.nextInt();
		if(age >=18) {
			System.out.println("i'll issue driver licence");
		} else {
			System.out.println("i won't you a driver licence");
		}
	}
}
