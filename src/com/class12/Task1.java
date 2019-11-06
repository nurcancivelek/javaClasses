package com.class12;

import java.util.Scanner;

public class Task1 {//SCANNERLA ORNEK
	
	public static void main(String[] args) {
		
		int [] array2= {2,5,4,7};
		for(int k:array2) {
			System.out.println(k);   // HEPSINI PRINTOUT EDER
		}
		
		int[] arr=new int [3];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) { //BIZ VALUE GIRIP CONSOLE, PRINT EDIYOR
			arr[i]=scan.nextInt();		//ONCE SCANNERA ATIYORUZ
		}
		for( int i = 0;i<arr.length; i++) {//SONRA AYNISINI YENIDEN YAZIP PRINT ETTIRIYORUZ
			System.out.println(arr[i]);
		}
	}

}
