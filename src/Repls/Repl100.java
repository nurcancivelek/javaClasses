package Repls;

public class Repl100 {
	//TO CHAR ARRAY
	
	public static void main(String[] args) {
		String str1="Welcome To Syntax Solutions" ;
		
		char[] ch= str1.toCharArray();
		
		for(int i=0; i< str1.length(); i++) {
			System.out.println(ch[i]);
			
		}
		
		//REPL 101  REPLACE
		
		
//		Create a String with value "hello how are you". 
//		Step 1: Replace the  "h" with "t".
//		Step 2: Replace "you" with "hi".
//		Step 3: Replace  "hello how are you"  with  "i am fine".
//
//		Print out all three output.
		String str= "hello how are you";
		System.out.println(str.replace('h', 't'));
		System.out.println(str.replace("you", "hi"));
		System.out.println(str.replace( "hello how are you", "i am fine" ));
	}

}
