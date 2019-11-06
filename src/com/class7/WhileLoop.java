package com.class7;

public class WhileLoop {

	
	public static void main(String[] args) {
	    
	    int time=8;
	    if (time<12) {  //condition is true
	        System.out.println("Good morning");  //code 1 executes 1
	    }System.out.println("------");
	    while ( time < 12 ) {          //if condition is true
	        System.out.println("good morning");  //code executes infinitely-- infinity loop
	        time++;
	    }
	    
	   //i want to print  good afternoonn 5 time
	    int i=1;
	    while(i<5) {
	    	System.out.println("good afternoon");
	    	i++;
	    }
	    
	    
    }
}
	
	
	

