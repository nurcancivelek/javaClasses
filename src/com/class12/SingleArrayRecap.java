package com.class12;

public class SingleArrayRecap {
	
	public static void main(String[] args) {
		int [] array1= new int [4];
		array1 [0]=12;
		array1 [1]=13;
		array1 [2]=14;
		array1 [3]=14;
	
		int [] array2= {2,5,4,7};
		for(int k:array2) {
			System.out.println(k);   // HEPSINI PRINTOUT EDER
		}
		
		
		System.out.println("********");
		//System.out.println(array1[1]);
	
		int num1=0;
	for(int s=0; s<4; s++) {
		num1=+array1[s];
		System.out.println(array1[s]);// HEPSINI PRINTOUT EDER
	}
	System.out.println("the sum of array1 is= "+num1);//SUM OF ALL
	
	System.out.println("===========");
	
	
	for(int i:array1) {
		System.out.println(i);   // HEPSINI PRINTOUT EDER
	}
	
	}

}
