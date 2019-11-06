package com.class4;

public class Task1 {
	public static void main(String[] args) {
		boolean diploma=true;
		double degree=3.5;
		if(diploma) {
			System.out.println("congratulations");
			if (degree>=3.5) {
				System.out.println("you are eligible for scholarship");		
			} else {
				System.out.println("you should've studied harder");
			}
		}else {
			System.out.println("you should get a degree");
		}
	
	}
}
