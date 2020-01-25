package com.class36;

import java.util.*;

public class SumInt {

	public static void main(String[] args) {
		
		/*
		 * Create a collection of integers in which you can keep duplicates. 
			Write a logic to find sum of all integers
		 */
		
		List<Integer> i= new LinkedList<>();
		i.add(12);
		i.add(43);
		i.add(6);
		i.add(98);
		i.add(29);
		i.add(76);
		i.add(81);
		i.add(41);
		i.add(81);
		
		int sum=0;
		for(Integer a: i) {
			sum=sum+a;
		}
		System.out.println(sum);
	}

}
