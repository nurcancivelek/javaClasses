package com.class33;

import java.util.ArrayList;

public class Class32Task4 {

	public static void main(String[] args) {
		
		/*
		 * Find the size of your arrayList and print all values from that
		 */
		ArrayList<String> names=new ArrayList<>();
		names.add("N");
		names.add("U");
		names.add("R");
		names.add("C");
		names.add("A");
		names.add("N");
		for(String n:names) {
			System.out.print(n.toLowerCase());
		}
		System.out.println();
		System.out.println(names.size());
	}

}
