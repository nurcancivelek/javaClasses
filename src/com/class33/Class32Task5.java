package com.class33;

import java.util.*;

public class Class32Task5 {

	public static void main(String[] args) {
		/*
		 * Create an arraylist of cars and retrieve all the values using 3 different ways.
		 */
	ArrayList<String> cars=new ArrayList<>();
	cars.add("BMW");
	cars.add("Mercedes");
	cars.add("Tesla");
	cars.add("Audi");
	
	System.out.println(cars);
	System.out.println("----1----");
	for(String s:cars) {
		System.out.print(s+" ");
	}
	System.out.println();
	System.out.println("-----2------");
	for(int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i));
	}
	System.out.println("----3-----");
	Iterator<String> it=cars .iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
