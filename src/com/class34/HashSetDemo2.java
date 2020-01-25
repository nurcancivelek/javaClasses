package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
//create a collection that will store Sweets type og Object and
		//i don't care about the order as long as
		//i don't have duplicate objects
		
		Set<Sweets> sweetSet=new HashSet<>();
		Sweets sweet=new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("IceCream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Macaroons"));
		sweetSet.add(new Sweets("Chocolate"));
		sweetSet.add(sweet);
		
		System.out.println(sweetSet.size());//6
		//how do we print name of each sweet?
		System.out.println("----1 way----");
		for(Sweets element:sweetSet) {
			System.out.println(element.name);
		}
		System.out.println("-----2 way----");
		
		Iterator<Sweets> ss=sweetSet.iterator();
		while(ss.hasNext()) {
			Sweets s=ss.next();
			System.out.println(s.name);
		}
		
	}

}
