package com.class4;

public class Task2 {
	public static void main(String[] args) {
		
	double rate=3.5;
	long mp=300000l;
	if(rate>=4.5) {
		System.out.println("i will not buy a house");
	}else {
		System.out.println("i will buy a house");
			if(mp>200000) {
				System.out.println("i will take a loan");
			}else {
				System.out.println("i will pay cash");
			}
	}
}
}