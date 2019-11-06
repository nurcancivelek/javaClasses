package com.class8;

public class Task2 {
	
	public static void main(String[] args) {
		/*write a code to find the sum of even and odd number
		 * from range 1-20
		 * expecting 2 outputs
		 * sum for odd nums=...
		 * sum for even=....
		 */
		
		int sumEven=0;
		for(int e=1; e<=20; e++) {
			if(e%2==0) {
				sumEven=sumEven+e;
				System.out.print(sumEven+" ");
			}
		}
	System.out.print("************");
		
		int sumOdd=0;
		for(int o=1; o<=20; o+=2) {
			sumOdd=sumOdd+o;
			System.out.print(sumOdd+ " ");
		}
		int sumEven1=0;
		int sumOdd1=0;
		for(int g=1; g<=20; g++) {
			if(g%2==0) {
				sumEven1=sumEven1+g;
			}else {
				sumOdd1=sumOdd1+g;
			}
			
		}
		System.out.println("*********************");
		System.out.println("The total of all even number= " +sumEven1);
		System.out.println("The total of all odd number= " +sumOdd1);
	}
}
