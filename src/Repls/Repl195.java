package Repls;

import java.util.*;

public class Repl195 {

	public static void main(String[] args) {
		
		Set<Integer> num=new HashSet<>();
		num.add(111);
		num.add(111);
		num.add(111);
		num.add(999);
		num.add(999);
		num.add(999);
		
		for(Integer i: num) {
			System.out.println(i);
		}
		
		Iterator<Integer> nums=num.iterator();
		while(nums.hasNext()) {
			Integer ii=nums.next();
			System.out.println(ii);
		}
	}

}
