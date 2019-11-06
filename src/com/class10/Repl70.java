package com.class10;

public class Repl70 {
	
	public static void main(String[] args) {
		  int a, b;
		  for(a=1; a<5; a++) {
		    for(b=1; b<5; b++) {
		      if(b==1 || b==4 ||a==1 || a==4 ) {
		    	  System.out.print("$");
		    	  
		      
		     
		    }else {
		    	  System.out.print(" ");  
		      }
		   
		   }
		    System.out.println(); 
		  }
		  		//Repl71
		  	  //Write a program to print out the pattern: 
			  //1 2 3 4 5 6 7 8 9 10 
			  //2 4 6 8 10 12 14 16 18 20 
			  //3 6 9 12 15 18 21 24 27 30 
			  //4 8 12 16 20 24 28 32 36 40 
			  //5 10 15 20 25 30 35 40 45 50
		  	
		  int n;
		  for(n=1; n<11; n++) {
			System.out.print(n+" ");  
		  }
		  System.out.println();
		  for(n=2; n<=20; n+=2) {
			  System.out.print(n+" ");
		  }
		  System.out.println();
		  for(n=3; n<=30; n+=3) {
			  System.out.print(n+" ");
		  }
		  System.out.println();
		  for(n=4; n<=40; n+=4) {
			  System.out.print(n+" ");
		  }
		  System.out.println();
		  for(n=5; n<=50; n+=5) {
			  System.out.print(n+" ");
		  }
		  System.out.println();
	
		  for (int i = 1; i <= 5; i++) {
		       for (int j = 1; j <= 10; j++) {
		      System.out.print((i * j) + " "); }

		    System.out.println(); }
	
	}
	
}
