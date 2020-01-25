package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class City {
	
	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order. 
	 * As a key store the name of the city and as a value store the length of the city 
	 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 
	 */

	
	public static void main(String[] args) {
		
		
		Map<String, Integer> cityMap= new TreeMap<>();
		
		System.out.println(cityMap.size());
		cityMap.put("Paris", 1 );
		cityMap.put("Sunnyvale", 2 );
		cityMap.put("Istnbl", 3 );
		cityMap.put("Palo Alto", 4 );
		cityMap.put("Cary", 5 );
		cityMap.put("Cupertino", 6 );
		
		Set<String> set=cityMap.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key=it.next();
			if(key.length()>7) {
				it.remove();
			}
		}
		System.out.println(cityMap);
			
		}
		
		
		
	}

