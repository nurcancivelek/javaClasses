package com.class10;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		//1 way:b
		
		char[]grade=new char[6];// char[] grades= {'A','B',....}; seklinde de olabilirdi
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		//2 way:
		//				0	 1	 2	  3		4	5
		char[] grades= {'A','B','C', 'D', 'E', 'F'};// boyle yazmak daha kolay yolu
		int a=2;
		System.out.println(grades[a]);// C gelir
		
		a+=2;//2+2
		System.out.println(grade[a]);
		a--;//4-1=3
		System.out.println(grades[a]);
		
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]);
		}System.out.println();
		
		
		//Create an array of names and store all names of your group.
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		
		String[] names=new String[7];
		names[0]="Nurcan";
		names[1]="Tilda";
		names[2]="Ayse";
		names[3]="Dilbara";
		names[4]="Nilufer";
		names[5]="Ridvan";
		names[6]="Umut";
		
		System.out.println(names[0]);
		
		//Create an array of words: Java, Saturday, day, coding, is.
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 

		String[] w=new String[5];
		w[0]="Java";
		w[1]="Saturday";
		w[2]="day";
		w[3]="coding";
		w[4]="is";
		
		System.out.println(w[1]+" "+w[4]+" "+w[0]+" "+w[3]+" "+w[2]);
		System.out.println("****************");
		String [] animals= {"Cat","Dog", "Cow", "Snake", "elephant"};
		
		int size= animals.length;
		//when value is dog; print i love dogs
		for(int m=0; m<size; m++) {
			if(animals[m].equalsIgnoreCase("dog")) {
				System.out.println("I love dogs!");
			}else {
				System.out.println(animals[m]+" ");
			}
		}
		System.out.println();
		//create an array to store 5 double values, print all in 1 line
		
		double[] d= {1.1, 1.2, 1.3, 1.4, 1.5};
		//int v= d.length;
		for(int n=0; n<d.length; n++) {// int v ye assign etseydik n<v olcakti
		System.out.print(d[n]+ " ");
		System.out.println();
		}
		//Create an array of countries. While retrieving all values from an array 
		//print capital for each country.
		
		String[] co= {"England", "USA","Greece","Germany","Turkey"};
		
		for(int z=0; z<co.length; z++) {
			if(co[z].equalsIgnoreCase("England")) {
				System.out.println("London");
			}else if(co[z].equalsIgnoreCase("USA")) {
				System.out.println("DC");
			}else if(co[z].equalsIgnoreCase("Greece")) {
				System.out.println("Athens");	
			}else if(co[z].equalsIgnoreCase("Germany")) {
				System.out.println("Bonn");
			}else if(co[z].equalsIgnoreCase("Turkey")) {
				System.out.println("Ankara");
			}else {
				System.out.println("unknown country, sorry");
			}
		}
	}
}
