package Repls;

import java.util.*;

public class Repl201 {

	public static void main(String[] args) {
		
		Set<String> num= new HashSet<>();
		num.add("first");
		num.add("second");
		num.add("third");
		num.add("fourth");
		num.add("fifth");
		
		for(String s:num) {
			System.out.println(s);
		}

	}

}
