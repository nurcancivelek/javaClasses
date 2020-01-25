package com.class33;

import java.util.*;

public class Class33Task7 {

	public static void main(String[] args) {
		
		//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

		ArrayList<String> drinks= new ArrayList<>();
		drinks.add("Milk");
		drinks.add("Juice");
		drinks.add("Soda");
		drinks.add("cider");
		System.out.println(drinks);
		for(int i=0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("e")||(drinks.get(i).contains("a"))){
				drinks.set(i,"Water");
			}
			System.out.println(drinks.get(i));
		}
//		System.out.println("-------");
//		Iterator<String>it=drinks.iterator();
//		
//		while(it.hasNext()) {
//			String s=it.next();
//			if(s.contains("e")||s.contains("a")) {
//				int i=drinks.indexOf(s);
//				drinks.set(i, "Water");
//			}
//		}
	}

}
