package Repls;

import java.util.*;

public class Repl200 {

	public static void main(String[] args) {
		
		Set<String> nums= new HashSet<>();
		nums.add("first");
		nums.add("second");
		nums.add("third");
		nums.add("fourth");
		nums.add("fifth");
		
		System.out.println(nums);
		nums.remove("second");
		System.out.println(nums);
		nums.clear();
		System.out.println(nums);
	}

}
