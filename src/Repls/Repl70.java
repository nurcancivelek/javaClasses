package Repls;

public class Repl70 {

	public static void main(String[] args) {
		
//		Write a program to print out the pattern: 
//
//			 
//			$$$$
//			$  $
//			$  $
//			$$$$
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if(i==1 || i==4 || j==1 || j==4 ) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
