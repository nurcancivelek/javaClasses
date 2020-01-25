package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<>();
		
		map.put(1, "google");
		map.put(2, "instagram");
		map.put(2, "syntax");
		map.put(4, "ibm");
		map.put(4, "syntax");
		map.put(6, "instagram");
		map.put(7, "facebook");
		
		System.out.println(map);
		System.out.println(map.size());
		
		map.replace(4, "Apple");
		System.out.println(map);
		map.remove(7);
		System.out.println(map);
		
		
		
	}

}
