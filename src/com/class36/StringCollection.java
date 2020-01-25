package com.class36;

import java.util.*;

public class StringCollection {

	/*
	 * Create the collection that will store single uniques Objects of a String 
	 * type in which order is preserved.
		Write a logic to concatenate all string from the collection.
	 */
	public static void main(String[] args) {
		List<String> str= new LinkedList<>();
		str.add("1");
		str.add("more");
		str.add("hour");
		str.add("to");
		str.add("go");
		
		Iterator<String> it = str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
