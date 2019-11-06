package Repls;

import java.util.Scanner;

public class Repl103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Write a for loop that will loop through every character 
//		of a word and print out each character, each on a separate line 
		
		
		
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    for(int i=0; i<word.length(); i+=2) {
	        System.out.print(word.charAt(i));
	       }
	    
	    
	    //write your code below
	    
	    char[] ch= word.toCharArray();
	    for(int i=0; i< word.length(); i++) {
			System.out.println(ch[i]);
			
		}
	    for(int i=0;i<=word.length()-1;i++){ //model solution
	        System.out.println(word.charAt(i));
	      }
	}

}
