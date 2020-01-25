package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String> stringlist=new ArrayList<>();
		stringlist.add("Esra");
		stringlist.add("Hasan");
		stringlist.add("Ak");
		stringlist.add("Salim");
		stringlist.add("Ak");
		stringlist.add("Helen");
		stringlist.add("John");
		//remove names that are shorter than 4 characters
		//stringlist.remove(2);
		//sout(stringlist);
		
		for(int i=0; i<stringlist.size();i++) {
			if(stringlist.get(i).length()<4) {
				stringlist.remove(i);
			}
			System.out.println(stringlist);
		}
	}

}
