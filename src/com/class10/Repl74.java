package com.class10;

public class Repl74 {
	
	public static void main(String[] args) {
	    
	    int[] a={45, 78, 12, 67, 55, 89, 23, 77, 88};
	        for(int b= 0; b<a.length; b+=2) {
	          System.out.print(a[b]+ " ");
	        }
	        
	    System.out.println();    
	   //REPL 75
	       // Write a program that creates an array with the following
	        //values{s, a, y,  b, n, c, t,  d, a, e, x} 
	        //and prints the values starting at index 0 and
	        //multiple of 2 using a for loop.

	        //Output:
	        //syntax
	 
	char[] array= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		for(int b=0; b<array.length; b++) {
			if(b%2==0) {
				System.out.print(array[b]);
			}
		}
	System.out.println();
		char[] arr= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
			for(int i=0; i<arr.length; i+=2) {
				System.out.print(arr[i]);
			}
		System.out.println();
		//REPL 76
			//Write a program that creates an array of strings with the 
			//following values{"This", "is", "array", "of", "strings"} 
			//and prints all values in one line.

			//Output:
			//This is array of strings	
			String[] s= {"This ", "is ", "array ", "of ", "strings "};
				for (int m=0; m<s.length; m++) {
					System.out.print(s[m]);
				}
			
	}
	    
	   
	}

