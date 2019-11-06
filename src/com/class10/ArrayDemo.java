package com.class10;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[0]=14;
		nums[3]=15;
		//to find number of elements we use length.(=kac numara atadigimizi bulmak icin,
		//length kullaniyoruz
		System.out.println(nums.length);
		System.out.println(nums[0]);
	
		//shortest	& most preferred way
		//					0		1		2			3
		String[] array= {"Winter","Fall", "Summer", "Spring"};
		//i was born in spring
		System.out.println("I was born in "+array[3]);
		System.out.println(array.length);
		//array.length will return a integer
		int arraySize=array.length;
		System.out.println(arraySize);
	
	
	
	}

}
