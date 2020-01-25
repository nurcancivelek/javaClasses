package Repls;

import java.util.*;
import java.util.Map.Entry;

public class repl209 {
	void display(Map<String,Integer> map) {
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}else {
			Set<Entry<String, Integer>> set= map.entrySet();
			for(Entry<String, Integer> i: set) {
				System.out.println(i.getKey()+" "+i.getValue());
			}
		}
		 
	 }

	public static void main(String[] args) {
		
		repl209 obj=new repl209();
		Map<String, Integer> map= new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		obj.display(map);
		map.clear();
		obj.display(map);
				
		 
	}

}
