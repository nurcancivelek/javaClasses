package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class Employee {

	public static void main(String[] args) {
		
		/*
		 * Create a Map that will store Employee name and salary.
		 *  Write a logic to retrieve an employee who gets the highest salary.
		 *   Output should be in the below format
			John Smith=$100000
		 */

		Map<String, Integer> emp=new TreeMap<>();
		emp.put("Ayse", 350000);
		emp.put("Elif", 150000);
		emp.put("Volki", 250000);
		emp.put("Nurcan", 180000);
		
		int max=0;
		Collection<Integer> salary= emp.values();
		for(Integer i:salary) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println(max);
		
			Set<String> key=emp.keySet();
			for(String keys:key) {
				if(emp.get(keys)==max) {
					System.out.println(keys+" = "+max);
				}
			}
		
		}
	}



