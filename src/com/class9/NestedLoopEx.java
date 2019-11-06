package com.class9;

public class NestedLoopEx {
	
	public static void main(String[] args) {
		
		for(int k=1; k<=5; k++) {//row=horizontal
			for(int l=1; l<=5;l++) {//column=vertical
				System.out.print(" * ");
			}
			System.out.println();// 5 li * yazip(column) asagida 5 li(row) yazdirmak icin
		}
		
		
		//12345
		//12345
		//12345
		//12345
		
		for(int n=1; n<=4; n++) {
			for(int m=1; m<=5; m++) {// n print edersek 11111,22222,33333,44444 cikar
				System.out.print(m);// m print edersek 12345,12345,12345,12345 cikar
			}
			System.out.println();
		}System.out.println("-------------------");
		for(int v=1; v<6; v++) {
			for (int c=1; c<10; c++) {
				System.out.print(c);
			}System.out.println();
		}
		System.out.println("******************");
		
		for(int f=5; f>0; f--) {
			for(int g=5; g>0; g--) {
				System.out.print(g);
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for(int f=5; f>0; f--) {
			for(int g=5; g>0; g--) {
				System.out.print(f);
			}
			System.out.println();
		}	
	}
}
