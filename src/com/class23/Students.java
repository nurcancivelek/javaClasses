package com.class23;

public class Students {
//	Write a java program of Class Students that takes 
//	students name and 3 subject grades. Inside your class 
//	also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks.
//	Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.

	String name;
	int grade1, grade2, grade3;
	
	Students(String name, int a, int b, int c){
		grade1=a;
		grade2=b;
		grade3=c;
		
		int average=(a+b+c)/3;
		System.out.println(name+" 's grades are:  "+a+" "+b+" "+c+" and the average is: "+average );
	}
	public static void main(String[] args) {
		Students s1=new Students("Ayse", 90,98,100);
		Students s2=new Students("Elif", 99,88,100);
		Students s3=new Students("Dila", 91,90,88);
		Students s4=new Students("Vera", 94,97,87);
	}
}
