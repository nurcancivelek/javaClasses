package Repls;

import java.util.Scanner;

public class Repl102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The code provided in your main method will take in five Strings 
//		and save them into an array called arr. 
//		Print out the first three letters of each element of array, one per line.  
//
//		Note: every element of array is at least 3 letters long. 
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
			
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below
	
		for(int  i=0; i<arr.length; i++) {
		
		System.out.println(arr[i].substring(0,3));
		}
		System.out.println();
	}
	
	
	}


