package Repls;

import java.util.*;

public class Repl206 {

	public static void main(String[] args) {
		Map< Integer, Double> maps= new TreeMap<>();
		
		maps.put(1 , 1.1);
		maps.put(2 , 2.2);
		maps.put(3 , 3.3);
		maps.put(4 , 4.4);
		maps.put(5 , 5.5);
		
		System.out.println(maps.containsKey(3));
		System.out.println(maps.containsValue(4.4));
		System.out.println(maps.containsKey(6));

		

	}

}
