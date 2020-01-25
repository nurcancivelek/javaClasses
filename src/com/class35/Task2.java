package com.class35;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		TreeMap<String, String> countries= new TreeMap<>();
		countries.put( "USA", "DC" );
		countries.put( "England", "London" );
		countries.put( "Japan", "Tokyo" );
		countries.put( "Korea", "Seoul" );
		
		System.out.println(countries);
	
		System.out.println("--for each--");
		
		Set<String> cities=countries.keySet();
		
		for(String city: cities ) {
			System.out.println(city+" : "+countries.get(city));
		}
		
		System.out.println("---iterator---");
		
		Iterator<String> countryit= cities.iterator();
		while(countryit.hasNext()) {
			String capital=countryit.next();
			String  mv= countries.get(capital);
			System.out.println(capital+" : "+mv);
		}
	}

}
