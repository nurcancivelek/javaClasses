package Repls;

public class Repl71 {
	public static void main(String[] args) {
//		Write a program to print out the pattern: 
//
//			1 2 3 4 5 6 7 8 9 10 
//			2 4 6 8 10 12 14 16 18 20 
//			3 6 9 12 15 18 21 24 27 30 
//			4 8 12 16 20 24 28 32 36 40 
//			5 10 15 20 25 30 35 40 45 50
		//my solution :)))
		for(int a=1; a<11; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b=2; b<21; b+=2) {
			System.out.print(b+" ");
		}
		System.out.println();
		for(int d=3; d<31; d+=3) {
			System.out.print(d+" ");
		}
		System.out.println();
		for(int c=4; c<41; c+=4) {
			System.out.print(c+" ");
		}
		System.out.println();
		for(int e=5; e<51; e+=5) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("---model solution------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
	}

}
