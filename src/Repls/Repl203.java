package Repls;

import java.util.*;
import java.util.Map.Entry;
public class Repl203 {

	public static void main(String[] args) {
		Map<String, String> list=new HashMap<>();
		list.put("Street", "Patrick ST");
		list.put("Suite", "265");
		list.put("City", "Vienna");
		list.put("Zip", "22180");
		list.put("Country", "United States");
		
//		 System.out.println(list.size());
//		 list.clear();
//		 System.out.println(list.size());

		Collection<String> str=list.values();
		for(String s: str) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("using keyset----------");
		//using ketSet();
		for(String keys:list.keySet()) {
			System.out.println(list.get(keys));
		}
		
		
		System.out.println();
		System.out.println(("iteratorrrr"));
		 Iterator<Entry<String, String>> it=list.entrySet().iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
