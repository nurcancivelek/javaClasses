package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class Homework {
/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.

 */
	
	public static void main(String[] args) {
		Map<Integer, String> bestBuy=new HashMap<>();
		bestBuy.put(112233, "Printer");
		bestBuy.put(918243, "MacBook");
		bestBuy.put(276543, "LG TV");
		bestBuy.put(432156, "Camera");
		bestBuy.put(987654, "Ipad");
		
		System.out.println(bestBuy);
		
		Set<Entry<Integer, String>> best=bestBuy.entrySet();
		System.out.println("--for each--");
		for(Entry<Integer, String> i:best) {
			System.out.println(i.getKey()+" = "+i.getValue());
		}
		System.out.println("==iterator==");
		Iterator<Entry<Integer, String>> it=bestBuy.entrySet().iterator();//best yerine bestbuy deseydik
		while(it.hasNext()) {				//o zaman enrtySet().iterator();
			Entry<Integer, String> ee=it.next();//best. desek o zaman entrySet e ihtiyac yok.
			System.out.println( ee.getKey()+" = "+ee.getValue());
			
		}
				
		

	}

}
