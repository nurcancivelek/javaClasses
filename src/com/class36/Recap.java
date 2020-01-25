package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class Recap {

	public static void main(String[] args) {
		//Map is collection of entry objects which are key and value pair object
		//Map is not a part of collection framework
		//every key in the mapholds unique objects
		//HashMap-->order is not maintained
		//TreeMap-->key objects store in ascending order
		//LinkedHashMap-->order is preserned on ke objects
		//HashTable-->similar to the HashMap
		//Map<K,V> variableName=new MapChildObject<>();
		Map<String,Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onio", 5);
		groceryMap.put("Apple", 10);
		//retrieve single value
		groceryMap.get("Apple");
		//verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);
		//how to retrieve all values?
		Collection<Integer> values=groceryMap.values();
		for(Integer val:values) {
			System.out.println(val);
		}
		Iterator<Integer>valIt=values.iterator();
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		//get all keys and map them to values(milk->2)
//		Set<String>keys=groceryMap.keySet();
//		for(String k : keys) {
		//System.out.println(k.toUpperCase()+"->"+groceryMap.get(k));
		
		//or we can do it in single line too:
		for(String k: groceryMap.keySet()) {
			System.out.println(k.toUpperCase()+"->"+groceryMap.get(k));
		}
		Iterator<String> keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"-->"+val);
		}
		//get all keys and map them to values(milk->2) using entrySet
		Set<Entry<String,Integer>>entr=groceryMap.entrySet();
		for(Entry<String,Integer>e:entr) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}
	
	//to get an entry object you need to call method .entrySet()-> a set entry object
	//Entry will have methods
	//.getKey() -->return a key object
	//.getValue()-->return a value object
			
		}

	


