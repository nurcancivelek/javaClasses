package com.class33;

import java.util.*;

public class Class32Task1 {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. 
		 */
	ArrayList<String> names=new ArrayList<>();
	names.add("N");
	names.add("U");
	names.add("R");
	names.add("C");
	names.add("A");
	names.add("N");
	for(String n:names) {
		System.out.println(n);
	}
	System.out.println();
	Iterator<String> it= names.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println();
	for(int i=names.size()-1; i>=0; i--) {
		System.out.println(names.get(i));
	}
	
	
	}

}
