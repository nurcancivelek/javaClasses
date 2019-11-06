package com.class11;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		
	
	System.out.println("***********");
    int [][] numbers= {
            {8,7,5,3,8},
            {1,5,6,4,9},
            {3,6,8,0,7},
            
    };
    
    //System.out.println(“The value in index 1 and 4 is= “+numbers[1][4]);
    
    //To identify the numbers of Rows
    System.out.println("The numbers of Arrays are:= "+numbers.length);
  
    //To identify the numbers of Columns/elements in a row
    
    System.out.println("The numbers of Columns are:= "+numbers[1].length);
    System.out.println("===========");
    System.out.println();
    
    for(int i=0;i<numbers.length;i++) {
        for(int j=0;j<numbers[i].length;j++) {
            System.out.print(numbers[i][j]+" ");
       
    
        }	
	System.out.println();
    }
  
    
	}	
}
	

