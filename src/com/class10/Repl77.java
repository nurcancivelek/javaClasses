package com.class10;

import java.util.Scanner;

public class Repl77 {

	 public static void main(String[] args) {
	 //Write a program that creates an array of strings
		 //with the size being 7. 
		// Ask the user to input Days of a week beginning
		 //with Sunday using Scanner class.
		// Add these inputs to your array and 
		 //then print all values from that array

		// Example:
		// Please enter day 1 of the week
	       
		 //Sunday
		// Please enter day 2 of the week
		 //Monday
		// Please enter day 3 of the week
		 //Tuesday
		 //Please enter day 4 of the week
		 //Wednesday
		 //Please enter day 5 of the week
		 //Thursday
		 //Please enter day 6 of the week
		// Friday
		 //Please enter day 7 of the week
		 //Saturday

		 //Hint: you will need 2 for loops but it is not nested loops. 
		 Scanner scan=new Scanner(System.in);
		 String[] days= new String[7];
		 
		 for(int a=0; a<7; a++) {
			 System.out.println("Please enter day "+(a+1) +" of the week");
			 days[a]= scan.nextLine();	
		 }
		 
		 for(int b=0;b<days.length;b++) {
			 System.out.println(days[b]);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
//	 	Scanner scan=new Scanner(System.in);
//	 	System.out.println("Enter a number from 0 to 6");
//	 	
//	 	//String[] day=new.String[dayss];
//	 	
//	 	String dayIs = null;
//	 	int dayss=scan.nextInt();
//// 		char dayss=scan.next().charAt(0);
//
//	 	
////	 	for(int a=0; a<dayss; a++) {
//	 		
////	 		dayIs=scan.nextLine();
//	 		
//	 		//String day=scan.nextLine();
//		 	switch(dayss){
//			 	case 0:
//				 	dayIs= "Sunday";
//				 	break;
//			 	
//			 	case 1:
//				 	dayIs=  "Monday";
//				 	break;
//			    
//			 	case 2:
//				 	dayIs=  "Tuesday";
//					break;
//			 	
//			 	case 3:
//				 	dayIs=  "Wednesday";
//					break;	
//			 	
//			 	case 4:
//				 	dayIs=  "Thursday";
//					 break;	
//			 	
//			 	case 5:
//				 	dayIs=  "Friday";
//					break;
//			 	
//			 	case 6:
//				 	dayIs=  "Saturday";
//					break;
//			 	
//				default:
//					dayIs="Unknown"	;
//	    
//		 	}
////		 	System.out.println("Please enter day "+ dayss+ "  of the week");
//		 	System.out.println();
//		 	System.out.println(dayIs);
////	 	}
//	 	Scanner scan=new Scanner(System.in);
			int[] arr=new int[5];
			for(int a=0; a<arr.length; a++) {
			  arr[a]=scan.nextInt();
			}
			for(int b=arr.length; b>0; b--) {
			   System.out.println(arr[b-1]);
			}
//	 	
	 }
}
