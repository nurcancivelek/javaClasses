package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		//create an ArrayList to store numbers
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);//index=3, size=4
		int size=numbers.size();
		System.out.println(size);//4
		
		//add more
		numbers.add(10000);
		//remove
		//numbers.remove(0);//index num 2 =100
		System.out.println(numbers);
		
		//numbers.remove(size-1);//length -1; 4-1=3
		System.out.println(numbers);
		
		
		//retrieve value from an arraylist
		int element=numbers.get(0);
		System.out.println(element);
		
		//1- for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2- advanced loop= always increment. does not go backwards
		for (Integer num:numbers) {//for(int i:numbers) is also ok
			System.out.println(num);
			
		}
		System.out.println("--------------");
		//i want to get values backward
		for(int i=numbers.size()-1; i>0; i--) {
			System.out.println(numbers.get(i));
		}
		System.out.println("=====");
		//3. way to retrieve values, using iteration : using iterator
		//Iterator is an Interface that help to iterate Through collections.
		//hasNext();---> return boolean if there is a next element in the collection 
		//next ();--> returns that next element 
		//remove();removes that next element 
		Iterator<Integer>iterator=numbers.iterator();		
		
		while(iterator.hasNext()) {
			int number=iterator.next();//autounboxing
			if(number%2==0) {
				System.out.println(number);
			}
			System.out.println(iterator.next());
		}
	}

}
