package com.class34;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//lets create a collection of veggies where i do not want to have duplicates
		
		HashSet<String> hset=new HashSet<>();
		
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zucchini");
		hset.add("carrot");
		hset.add("zucchini");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		
		//they do not have any methods to retrieve elements from the collection
		//.get(); , .set();---> not applicable for set, only applicable for list
		
		//so, how can we retrieve all elements?? --> using either iterator
		//or advanced loop but not for loop
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		System.out.println("--------");
		//second option is enhanced for loop
		for(String elements:hset) {
			System.out.println(elements);
		}
	}

}
