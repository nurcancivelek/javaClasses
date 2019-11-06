package Repls;

import java.util.Scanner;

public class ReplArrays {

	public static void main(String[] args) {
			// REPL 81...
			//Write a program that creates an array of integers that 
			//stores the following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
			//Print the values using a for loop starting at index 1 
			//and increment by 3, and then print value divided by its index.

			//Output:
			//78 13 11 
			
			int[] arr= {45, 78, 12,  67, 55, 89, 23, 77, 88};
			for(int a=1; a<arr.length; a+=3) {
				System.out.print(arr[a]/a + " ");
			}
		System.out.println();
		System.out.println("********************");
	//REPL 80
	//Note: Create a Scanner Class

	//Create an int array with the size of 5 and input values with Scanner. 
	//Create a loop and enter values into one loop (don't print prompt question for Scanner). 
	//Create the second loop to print the values and it must be multiplied by 10.
	//Print out each element of the array multiplied by ten, one element per line.

	//Example:
	//Input:
	//1
	//2
	//3
	//4
	//5

	//Output:
	//10
	//20
	//30
	//40
	//50
			Scanner scan=new Scanner(System.in);
			int[] array= new int[5];
			for(int a=0; a<array.length; a++ ) {
			array[a]=scan.nextInt();	
				
			}
			for(int b=0; b<array.length; b++) {
				System.out.println(array[b] *10);
			}
			System.out.println("-----------------");
	//REPL 79
	//Write a program that creates an array of integers of size 11.
	//Add the years 2010 to 2020 to your array one by one using a for loop and 
	//then print all those values. 

	//Example: 
	//2010
	//2011
	//2012
	//2013
	//2014
	//2015
	//2016
	//2017
	//2018
	//2019
	//2020
			
		int[] arrays=new int[11];
		for(int d=0; d<arrays.length; d++) {
			arrays[d]=2010+d;
			System.out.println(arrays[d]);
		}
			
	//REPL 78	
	//Note: Create Scanner class

	//Write an array with size of 5. 
	//Use a loop to input values to the array (don't print any prompt message for Scanner).
	//Then print out all the elements you have created in the first loop in reverse order. 

	//Example: 
	//Input: 
	//1
	//2
	//3
	//4
	//5

	//Output:
	//5
	//4
	//3
	//2
	//1	
			
	int[] ar=new int[5]	;
	for(int c=0; c<ar.length; c++) {
		ar[c]=scan.nextInt();
	}
	for(int n=ar.length; n>0; n--) {
		System.out.println(ar[n-1]);
	}		
			
	//REPL 77		
			
	//Write a program that creates an array of strings with the size being 7. 
	//Ask the user to input Days of a week beginning with Sunday using Scanner class.
	//Add these inputs to your array and then print all values from that array

	//Example:
	//Please enter day 1 of the week
	//Sunday
	//Please enter day 2 of the week
	//Monday
	//Please enter day 3 of the week
	//Tuesday
	//Please enter day 4 of the week
	//Wednesday
	//Please enter day 5 of the week
	//Thursday
	//Please enter day 6 of the week
	//Friday
	//Please enter day 7 of the week
	//Saturday

	//Hint: you will need 2 for loops but it is not nested loops. 		
			
			
	String[] days= new String[7];	
	for(int m=0; m<7; m++)	{
		System.out.println("Please enter day "+(m+1)+" of the week");
		days[m]= scan.nextLine();
	}	
	for(int k=0; k<days.length; k++) {
		System.out.println(days[k]);
	}		
	//REPL 76
	//Write a program that creates an array of strings 
	//with the following values{"This", "is", "array", "of", "strings"}
	//and prints all values in one line.

	//Output:
	//This is array of strings
			
	String[] s=	{"This", "is", "array", "of", "strings"};	
			
		for(int t=0; t<s.length; t++) {
			System.out.print(s[t]+ " ");
		}	
			
			
			
			
			
			
			
			
			
			
	}
}
