package Repls;

import java.util.*;
public class Repl205 {

	public static void main(String[] args) {
		Map<String, String> list=new HashMap<>();
		list.put("Street", "Patrick ST");
		list.put("Suite", "265");
		list.put("City", "Vienna");
		list.put("Zip", "22180");
		list.put("Country", "United States");
		
		Set<String> keys=list.keySet();
		for(String key:keys) {
			System.out.println(key);

		}
	}
}
