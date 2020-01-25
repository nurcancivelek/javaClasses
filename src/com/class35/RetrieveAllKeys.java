package com.class35;

import java.util.*;

public class RetrieveAllKeys {

	public static void main(String[] args) {
		// create a map of a person(name, last name, address, city, state)

		Map<String, String> personMap=new HashMap<>();
		personMap.put("Name" ,"Ahmet" );
		personMap.put("LastName" ,"Yildiz" );
		personMap.put("Address" ,"123 Test" );
		personMap.put("City" ,"Dallas" );
		personMap.put("State" , "TX");
		
		System.out.println(personMap);
		
		//how to retrieve a specific value
		String value=personMap.get("State");
		System.out.println(value);
		System.out.println("---for each loop keys---");
		//how to retrieve all keys and values
		
		Set<String> keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key);
			
		}
		System.out.println("burada");
		System.out.println();
		for (String key: personMap.keySet()) {
			System.out.println(key + ":" + personMap.get(key));
		    
		}
		
		//or iterator
		System.out.println("---iterator keys---");
		Iterator<String> ki=keys.iterator();
		while(ki.hasNext()) {
			System.out.println(ki.next());
		}
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next()+personMap.get(it.next()));
			String mapkey=it.next();
			
			System.out.println(mapkey+" ; "+personMap.get(mapkey));
			
		}
	}

}
