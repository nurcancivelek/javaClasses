package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class homeWork {

	public static void main(String[] args) {
		//create an arraylist of cars and retrieve all the values
		//using 3 different ways
		ArrayList<String>cars=new ArrayList<>();
		cars.add("Tesla");
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("WV");
		cars.add("Honda");
		
		int size=cars.size();
		System.out.println(size);
		
		System.out.println("--1--");
		for(String car:cars) {
			System.out.println(cars);
		}
		System.out.println("--2--");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("--3--");
		
        // 3.using Iterator
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----4th Way-------");
        // 4. While loop
        int i = 0;
        while (cars.size() > i) {
            String car = cars.get(i);
            System.out.println(cars);
            i++;
        }


	}

}
