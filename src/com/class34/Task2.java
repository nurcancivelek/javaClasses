package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create  a  Set  of  cities  in  which  you  want  to make sure that 
		 * insertion order is maintained. Using Iterator remove any city that 
		 * starts with “A”;
		 */
		Set<String> cities=new LinkedHashSet<>();
		cities.add("Albuquerque");
		cities.add("Sunnyvale");
		cities.add("Cupertino");
		cities.add("Mountain View");
		cities.add("Palo Alto");
		System.out.println(cities);
		
		 Iterator<String> itt=cities.iterator();
		while(itt.hasNext()) {
			String ci=itt.next();
				if(ci.startsWith("A")) {
					itt.remove();
				
				}
				
			}
		System.out.println(cities);
			
		}
	}	
	

