package com.class35;

import java.util.*;


public class RetrieveAllValues {

	public static void main(String[] args) {
		// create a map of a person(name, last name, address, city, state)

				Map<String, String> personMap=new HashMap<>();
				personMap.put("Name" ,"Ahmet" );
				personMap.put("LastName" ,"Yildiz" );
				personMap.put("Address" ,"123 Test" );
				personMap.put("City" ,"Dallas" );
				personMap.put("State" , "TX");
				
				System.out.println(personMap);
				
				System.out.println("----- printing all values with for each loop-----");
				Collection<String> values=personMap.values();
				for (String val:values) {
					System.out.println(val);
				}
				System.out.println("---......with iterator---");
				Iterator<String> vit=values.iterator();
				while(vit.hasNext()) {
					System.out.println(vit.next());
				}
				
				System.out.println("---key:value----");
				//how can retrieve and print values key:value
				for (String key: personMap.keySet()) {
				    //System.out.println("key : " + key);
				    System.out.println(key + ":" + personMap.get(key));
				}
				
				
				
				

	}

}
