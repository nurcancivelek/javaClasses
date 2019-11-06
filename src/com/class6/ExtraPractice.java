package com.class6;

import java.util.Scanner;

public class ExtraPractice {
	public static void main(String[] args) {
		
		/*write a program that will read three inputs of scores(quiz, midterm, and final scores) 
		 * and determine the grade based on the following rules:
		 * if the average score -->=90; grade=A
		 * if the average score >=70 and <90; grade=B
		 * if the average score >=50 and<70 grade;C
		 * if the average score<50; grade=F
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("What did you get from the quiz?");
		int q=scan.nextInt();
		System.out.println("what is your midterm score?");
		int m=scan.nextInt();
		System.out.println("and your final??");
		int f=scan.nextInt();
		//int average=(q+m+f)/3;>>>> de deyip conditiondaki islem yerine average yazabilirdik. daha mantikli olurdu
		
		if ( (q+m+f)/3>=90  ) {
			char av='A';
			System.out.println("Your grade will be "+av);
		}else if ((q+m+f)/3<90 && (q+m+f)/3>=70 ) {
			char av='B';
			System.out.println("Your grade will be "+av);
		}else if ((q+m+f)/3<70 && (q+m+f)/3>=50 ) {
			char av='C';
			System.out.println("Your grade will be "+av);
		}else {
			char av='F';
			System.out.println("Your grade will be "+av);
			
		}
	/*write a program to determine the classMode.
	 * if there is no rain=sclassMode="in class"
	 * otherwise classMode"online"
	 */
	boolean rain=true;
	if(rain) {
		System.out.println("online");
	}else {
		System.out.println("in class");
	}
	
	}
}
