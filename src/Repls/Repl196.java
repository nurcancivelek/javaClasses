package Repls;

import java.util.*;

public class Repl196 {

	public static void main(String[] args) {
		
		Set<String> numbers=new HashSet<>();
		numbers.add("third");
		numbers.add("first");
		numbers.add("second");
		
		System.out.println(numbers);
		numbers.removeAll(numbers);
		System.out.println(numbers);
		
		
		
		Iterator<String> it=numbers.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
		for(String s:numbers) {
			System.out.println(s);
		}

	}

}
