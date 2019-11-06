package com.class11;

public class MoreTasks {
	public static void main(String[] args) {
//		Create a 2D array or integer type where you will store odd and 
//		even numbers in 3 rows and 4 columns. Develop a program which will 
//		identify/print the even numbers only.
		int [] [] all= { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		for(int [] b:all) {
			for(int c:b) {
				if(c % 2 == 0) {
					System.out.println(c);
				}
				
			}
		}
		
		System.out.println("**************");
//		Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
//		Print the sum of all numbers.
		int [] [] all1= { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		int sum=0;
		for(int [] bb:all1) {
			for(int cc:bb) {
			sum= sum+cc;
			}
		}
		System.out.println(sum);
		
//		Create a 2D array of integer type with 3 rows and 4 columns 
//		and print all values of the whole array.
//
//		======================================================
//		Create a 2D array where you will store the following values: 
//			Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//		After storing values print the following:
//		Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		String [] [] onesie= {{"Mrs","Mr","Ms","Miss"}, {"Smith", "Obama", "Jackson", "Jordan"}};
		for(int nn=0; nn<4; nn++) {
			System.out.println(onesie [0] [nn]+" "+onesie[1] [nn]);
		}
		
		//Create a 2D array that first row will contain 4 names and 
//		second row will contain grades. Then you program should print 
//		name of the students that has as an A and B grade
		
		String[][] names1= {{"tilda","Nurcan","Ayse","Asel"},{"D","A","B","C"}};
        for(String []name: names1) {
            for (String j:name) {
                if (j.equals("Nurcan")){
                    System.out.println(j+" "+names1[1][1]);
                }else if (j.equals("Ayse")){
                    System.out.println(j+" "+names1[1][2]);
                }
                    
                }
            }

		String [] [] namess= {{"Tilda", "nurcan", "elif", "asel"}, {"A", "B", "C", "D"}};
		for (String [] nameo:namess) {
			for(String k:nameo) {
				if (k.equals("Nurcan")){
                    System.out.println(k+" "+namess[1][1]);
                }else if (k.equals("Ayse")){
                    System.out.println(k+" "+namess[1][2]);
                }
                    
                }
            }

//		=====================================================
//		Create an array of cars : american, german, korean, italian.
//		Then retrieve all values from that array
		String[][] cars={{"Ford", "Mercedes", "Hyundai", "Maserati"}, {"American", "German", "Korean", "Italian"}};
		for(int car=0; car<4; car++) {
			System.out.println(cars [0] [car]+" is a(n) "+  cars[1] [car]+" car");
				//System.out.println( c +" is a car made in "+ cars );
			}
		}
		
//		Create an array of countries: north america countries, 
//		south america countries, europe countries, asian countries, african countries.
//		Then print all values from that array.
	}


