package Repls;

import java.util.*;

public class Repl191 {

	public static void main(String[] args) {
		
		List<Boolean> listA=new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		List<Boolean> listB=new ArrayList<>();
		
		listB.addAll(listA);
		listB.addAll(listA);
		
		
		
		System.out.println(listB);
	}

}
