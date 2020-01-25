package com.class1;

import java.util.Arrays;

public class Hello {

	public static void main(String [] args) {

			System.out.println ("hello world!!!");	
			System.out.println ("hello friends!!!");
			
			// single line comment
			/*multiple line comments
			 * kendine hatirlatma..
			 * not almalik
			 * burda bitiyor
			 * */
			
			//2nd largest number
			int[] numArray= {12,13,12,15,0, -1};
			Arrays.sort(numArray);
			System.out.println(numArray[numArray.length-2]);
			
			
			
//			int[] array= {1000,200,222,11};
//			int largest=array[0];
//			int secondLargest=[0];
//			for(int i=0; i<array.length; i++) {
//				if (array[i]>largest) {
//					secondLargest=largest;
//					largest=array[i];
//					}else if (array[i]>secondLargest && array[i]!=largest){
//						secondLargest=array[i];
//						}
//				}
//			System.out.println("Thelargestnumber="+largest+"andsecondLargest="+secondLargest);
	}
}