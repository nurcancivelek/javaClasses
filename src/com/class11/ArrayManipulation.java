package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		String[] actualNames= {"Jhon","Smith", "Alex","Tanaz"};
        
		Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","John","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));// 2 stringi compare ediyoruz
        
        //String firstName=
        
        int[] numberss= {123,34,15,66,99};
        for(int i:numberss) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("*******");
        
        
        Arrays.sort(numberss);
        for(int i:numberss) {
            System.out.print(i+" ");
        }
	}
}
