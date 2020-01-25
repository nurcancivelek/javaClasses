package com.class34;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a Set collection in which you need to add  names  of  the  countries.
		 * In  this  set  we want all objects to be sorted in alphabetical order.  
		 * Using  2  different  ways  retrieve  all elements from set.
		 */
		
		Set<String> countries= new TreeSet<>();
		countries.add("USA");
		countries.add("Germany");
		countries.add("England");
		countries.add("France");
		
		System.out.println(countries);
		
		System.out.println("----for each loop----");
		for(String s:countries) {
			System.out.println(s);
		}
		System.out.println("----Iterator----");
		Iterator<String> it= countries.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		
		
		
		
		

	}

}
