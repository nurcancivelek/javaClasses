package com.class4;

public class Recap {
public static void main(String[] args) {
	
	int num=90;
	num-=200; //90-200=-110
	num-=110;
	num+=220;
	if(num>0) {
		System.out.println(num + " is a posivitive number");
	}else if(num==0) {
		System.out.println("Value of num is " + num);
	}else {
		System.out.println(num + " is a negative number");
	}
	
	//even or odd number: divisible to 2 without any remainder!
	
	int i=137;
	if(i%2==0) {
	System.out.println(i+" is an even number");	
	}else {
		System.out.println(i+" is an odd number");
	}
	if(i%2!=0) {
		System.out.println(i+" is an odd number");
	}else {
		System.out.println(i+" is an even number");
	}
}
}
	

