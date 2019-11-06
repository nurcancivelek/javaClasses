package com.class11;

public class Task {

	public static void main(String[] args) {
		//create a 2D array of integer type with 3 rows and 4 columns 
	  	//and print all values of the whole array.
	    	
		int [] [] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,0,2,1}
		};
		int sum=0;
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
			sum = sum +arr[a] [b];	
				//System.out.print(arr[a] [b]+ " ");
			//System.out.println();
			}
			System.out.println(sum);
			
		}
		System.out.println("the sum of all elements in the array is= "+sum);
		System.out.println();
		int [][] nums= { {1,20,30,40},{2,60,70,80},{3,10,11,12,13}};
        for (int []i:nums) {
            for( int j: i) {
                System.out.print(j+" ");
            }System.out.println();
		
	}
        //Sohilin ornegi::::::::
        int[][] numbers = {
                { 8, 7, 5, 3 },
                { 1, 5, 6, 7 },
                { 3, 6, 8, 1 }
                };
        
        int sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //System.out.print(numbers[i][j] + ” “);
                
                sum1=sum1+numbers[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the array is= "+sum1);
        
        int sum11=0;
        for(int nums1[]: numbers) {
            for(int getNum:nums1) {
                sum11=sum11+getNum;
            }
        }
        System.out.println("The sum of all elements in the array is= "+sum11);
    }
        //SUREKLI HATA VERIYOR BU KOD. VOLKANA SOR!!!!!!!!!!!!!!
//        Create a 2D array or integer type where you will store odd and even numbers in 3 rows
//        and 4 columns. Develop a program which will identify/print the even numbers only.
       
//	int[][] allnums = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//    int sumAll=0;
//        for (int[] even : allnums) {
//            for (int j : even) {
//                sumAll += j;
//            }
//        }
//        System.out.println(sumall);
////        
//	
//	int [] [] AllNums= { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
//	int sumall; 
//	for(int [] even:AllNums) {
//		for(int o:even) {
//		sumall+=o;
//		
//	}
//	}
//	System.out.println(sumall);
 //		  Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
//        Print the sum of all numbers
        
        
        
        
        
        
}
