package Repls;

import java.util.*;
import java.util.Map.Entry;

public class Repl208 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		System.out.println("HasMap before Replace");
		Set<Entry<String, String>> nums= map.entrySet();
		Iterator<Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> ent=it.next();
			String entry=ent.getKey()+" : "+ent.getValue();
			System.out.println(entry);
		}
		System.out.println("--------------");
		System.out.println("HashMap After Replace");
		
		map.replace("FIVE", "EEE", "SUMAIR");
		map.replace("THREE","CCC", "ASEL");
		for (Entry<String, String> entry : nums )
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

	}

}
