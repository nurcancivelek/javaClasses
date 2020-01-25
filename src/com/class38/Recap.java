package com.class38;

public class Recap {

	public static void main(String[] args) {
		

		int num=1;
		
		//runtime- unchecked exception
		int[] nums= {12,13};
		
		
		try {
			System.out.println(nums[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" trying to access element outside of the boundary");
		}
		//compile time-checked
		//Thread.sleep(10000); to pause execution
		System.out.println("end of code");
	}

}
