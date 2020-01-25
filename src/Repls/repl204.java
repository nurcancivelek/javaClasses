package Repls;

import java.util.*;
import java.util.Map.Entry;

public class repl204 {

	public static void main(String[] args) {
		//printing only values in upper case
		Map<String, String> list=new HashMap<>();
		list.put("Street", "Patrick ST");
		list.put("Suite", "265");
		list.put("City", "Vienna");
		list.put("Zip", "22180");
		list.put("Country", "United State");
	
		Collection<String> str=list.values();
		for(String s: str) {
			System.out.println(s.toUpperCase());	
		
	}
	}

}