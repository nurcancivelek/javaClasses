package com.class33;

import java.util.*;

public class Class32Task8 {
	public static void main(String[] args) {
		/*
		 * Create an arrayList of even numbers from 1 to 50.
		 *  Using Iterator remove any number that is divisible by 5 from that arrayList.
		 */
		
		ArrayList<Integer> even=new ArrayList();
		for(int i=0; i<51; i++) {
			if(i%2==0) {
				even.add(i);
			}
		}
		System.out.println(even);
		Iterator<Integer> it=even.iterator();
		while(it.hasNext()) {
			int i=it.next();
			if(i%5==0) {
				it.remove();
			}
		}
		System.out.println(even);
		
	}

}
