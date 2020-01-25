package Repls;

import java.util.*;
import java.util.Map.Entry;

public class Repl207 {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		System.out.println("HashMap Before Remove :");
		Set<Entry<String, String>> nums= map.entrySet();
		for(Entry<String, String> str: nums) {
			System.out.println(str.getKey()+" : "+str.getValue());
		}
		System.out.println("--------------");
		System.out.println("HashMap after Remove :");
		
		map.remove("ONE", "AAA");
		map.remove("FOUR", "DDD");
		for (Entry<String, String> entry : nums)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
		
		
		
		
		
		
		//while(it.hasNext()) {
//			Entry<String, String> ent=it.next();
//			String str=ent.getKey()+" : "+ent.getValue();
//			map.remove("ONE");
//			map.remove("FOUR");
//			System.out.println(map);
//		}
//		
		
		
		
	}

}
