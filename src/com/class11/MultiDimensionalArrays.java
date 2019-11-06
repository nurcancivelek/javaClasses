package com.class11;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
//Declare 2d Array
        
        int[][]array= new int[3][4];// 3 rows and 5 columns
        
        //1st Row
        array [0][0]=45;
        array[0][1]= 80;
        array [0][2]=33;
        array [0][3]=20;
        
        //2nd row
        
        array [1][0]=90;
        array[1][1]= 87;
        array [1][2]=43;
        array [1][3]=33;
        //3rd Row
        array [2][0]=90;
        array[2][1]= 65;
        array [2][2]=11;
        array [2][3]=97;
        System.out.println(array[1][3]);
        
        //task; create 2d array of String with 2 rows and 3 columns
        String [] [] task= new String [2] [3];
        //1 row:
        task[0] [0] = "nur";
        task[0] [1] = "can";
        task[0] [2] = "civ";
        
        task[1] [0] = "el";
        task[1] [1] = "ek";
        task[1] [2] = "ayse";
        
        System.out.println(task [1] [2]);
        System.out.println("***************");
        
        int [] [] numbers= {
        		{8,7,5,3,8},
        		{1,5,6,4,9,8},
        		{3,6,8,0,7}
        };
        System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
        //to identify the numbers of rows
        System.out.println("The numbers of Rows are:= "+numbers.length);
        
        //To identify the numbers of Columns/elements in that row
        System.out.println("The numbers of columns/elements are:= "+numbers[0].length);
        
        System.out.println("=================");
        
        System.out.println();
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers[i].length; j++) {
        		System.out.print(numbers [i] [j]+ " " );
        	}
        }
        System.out.println();
        System.out.println("-----------------");
        for(int[] i: numbers) 
        {
            for(int j: i) 
            {
                System.out.print(j + " ");
                
            }
            System.out.println();
        }

	}
}
