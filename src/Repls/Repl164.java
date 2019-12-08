package Repls;

import java.util.Scanner;

public class Repl164{
	final String reverseString(String str) {
		String reversed="";
		for(char c:str.toCharArray()) {
			reversed=c+reversed;
		}
			return reversed;
	}
	public static void main(String[] args) {
		Repl164 m=new Repl164();
		System.out.println(m.reverseString("hello"));
	}
}
//MODEL SOLUTION
class Main {

	  public static void main(String[] args){
	    
	    Main main=new Main();
	    System.out.println(main.reverseString());
	  }
	  
	 public final String reverseString(){
		    Scanner scan =new Scanner(System.in);
		    String reverse= scan.nextLine();
		    String reverseString="";
		    for(int i=reverse.length()-1;i>=0;i--){
		      reverseString=reverseString+reverse.charAt(i);
		    }
		    
		    return reverseString;
	  }
	}