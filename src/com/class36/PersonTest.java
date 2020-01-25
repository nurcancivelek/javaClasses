package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer, Person> per= new TreeMap<>();
		per.put(1, new Person("Ayse" , "Civ" , 13 , 50  ));
		per.put(2, new Person("Elif" , "Cive" , 8 , 20 ));
		per.put(3, new Person("Ally" , "Son" , 35 , 70000 ));
		per.put(4, new Person("Seima" , "ttr" ,38  , 80000 ));
		per.put(5, new Person("lila" , "Nomad" , 44 , 65000 ));
		
		Set<Entry<Integer, Person>> pset=per.entrySet();
		Iterator<Entry<Integer, Person>> it=pset.iterator();
		while(it.hasNext()) {
			Entry<Integer, Person> i=it.next();
			System.out.print(i.getKey()+"---");
			i.getValue().display();
		}
		
		
		

	}

}
