package com.class34;

import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		//How  can  you  remove  all  duplicates  from:
		
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> s=new HashSet<>();
		s.addAll(aList);
		
		
		System.out.println(s);
		//remove all and add all
		aList.clear();
		System.out.println(aList);
		aList.addAll(s);
		System.out.println(aList);
		 
		//how can i access/update just 1 value from the set collection
		
		Set<String> lset=new LinkedHashSet<>();
		lset.add("morning");
		lset.add("noon");
		lset.add("evening");
		lset.add("night");
		
		//convert to ArrayList
		
		List<String> myList=new ArrayList<>();
		myList.addAll(lset);
		String element=myList.get(2);// or mylist.remove(1); da olabilir.remove eder
		System.out.println(element);
		
		//another way to create an object of ArrayList by passing values to the constructor.
	}

}
