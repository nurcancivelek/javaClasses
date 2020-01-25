package com.class33;

import java.util.*;

public class Class32Task6 {
	
	/*
	 * Create  an  arrayList  of  words.  Remove  every word that ends with “e”. Use iterator
	 */
	
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<>();
		words.add("love");
		words.add("hi");
		words.add("bye");
		words.add("lied");
		words.add("nope");
		
		System.out.println(words.size());
		System.out.println(words);
		
		System.out.println("====================");

		Iterator<String> it=words.iterator();
		
		while(it.hasNext()) {			
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		
		System.out.println("====================");
		Iterator<String> it2=words.iterator();
		while(it2.hasNext()) {
			String w = it2.next();
			System.out.println(w);
		}
		
	}

}
