package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {

	public static void main(String[] args) {
		//create an arraylist of words
		//remove every word that ends with "e".
		//use iterator
		List<String>list=new ArrayList<>();
		list.add("Cute");
		list.add("love");
		list.add("hello");
		list.add("java");
		
		Iterator<String>it=list.iterator();
		while(it.next().endsWith("e")) {
			it.remove();
		}
		System.out.println(list);
	}
	
	
}
