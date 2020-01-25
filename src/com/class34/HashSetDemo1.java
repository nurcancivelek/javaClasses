package com.class34;

import java.util.*;

public class HashSetDemo1 {

	public static void main(String args[])
	{HashSet<String> hset = new HashSet<String>();      
//	 Adding elements to the HashSet
	 hset.add("Apple"); 
	 hset.add("Mango");  
	 hset.add("Grapes");
	 hset.add("Orange");
	 hset.add("Fig");    
	 //Addition of duplicate elements     
	 hset.add("Apple");      
	 hset.add("Mango");     
	 //Addition of null values     
	 hset.add(null);     
	 hset.add(null);      
	 //Displaying HashSet elements     
	 System.out.println(hset);    
	}
	
}
class demoHash {
	public static void main(String[] args) {   
		// Create a HashSet     
		HashSet<String> hset = new HashSet<>(); 
		//add elements to HashSet   
		hset.add("Chaitanya");  
		hset.add("Rahul");   
		hset.add("Tim"); 
		hset.add("Rick");  
		hset.add("Harry");  
		Iterator<String> it = hset.iterator();   
		while(it.hasNext()){  
			System.out.println(it.next());     }  
	}

}