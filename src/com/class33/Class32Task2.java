package com.class33;

import java.util.*;

public class Class32Task2 {

	public static void main(String[] args) {
		/*
		 * Find  out  whether  the  given ArrayList  is empty or not? 
		 */

		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(1);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		System.out.println(nums.isEmpty());
		if(nums.isEmpty()) {
			System.out.println("Arraylist is empty");
		}else {
			System.out.println("arraylist is not empty");
		}
		
	}

}
