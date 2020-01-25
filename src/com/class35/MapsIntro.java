package com.class35;

import java.util.*;

public class MapsIntro {

	public static void main(String[] args) {

		HashMap<Integer, String>map=new HashMap<>();
		
		
		//to store key+value pair into mapmap.put(101, "john");
		map.put(101, "john");
		map.put(102, "jack");
		map.put(103, "jane");
		map.put(104, "jenny");
		System.out.println(map.get(101));
		System.out.println(map.entrySet());
		System.out.println(map);
		
		//how to verify if there is any elements in the map
		
		System.out.println(map.isEmpty());//i added this
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
			System.out.println(flag);//i added this
		}
		//i want to add more entry objects
		//map.put(105,"john"); --> CE: key and value type must be matched
		
		//adding duplicate values
		map.put(105,"john");
		System.out.println(map);
		
		//adding duplicate keys--> override,(no more jack) we cannot have duplicate keys
		map.put(102,"ayse");
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103, "nurcan");
		System.out.println(map);
		
		//how to remove an object from the map
		map.remove(101);
		System.out.println(map);
		
		System.out.println("----------");
		//how to verify if a certain key exists
		
		boolean flag1=map.containsKey(200);
		System.out.println(flag1);
		if(flag1) {
			map.replace(200, "Seval");
		
		}else {
			map.put(200, "nurcan");
		}
		System.out.println(map);
		
		//how to verify id a certain value exists?
		
		boolean contains=map.containsValue("nurcan");
		System.out.println(contains);
	}

}
