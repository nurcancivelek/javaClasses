package Repls;

import java.util.*;

public class Repl193 {

	public static void main(String[] args) {
		
		List<Integer> list= new LinkedList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		int sum = 0;
		
		for(int i=0; i<list.size(); i++) {
			sum+= list.get(i);
			
		}
		System.out.println("Result of sum is "+sum);
		
		//for each
		for(Integer i: list) {
			sum+=i;
		}
		System.out.println(sum/2);
	}

}
