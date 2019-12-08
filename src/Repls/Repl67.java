package Repls;

import java.util.Scanner;

public class Repl67 {
	public static void main(String[] args) {
//		Write a for loop that will print out the numbers starting 
//		at 0 and ending at twice of the end variable exclusive. 
//		Each number should be on the same line, separated by a space. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Int; ");
		int end=scan.nextInt();
		
		for(int i=1; i<end*2+1; i++) {
			System.out.println(i+" ");
		}
		
	}

}
