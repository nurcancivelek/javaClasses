package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
	
//way
	int[] b; //declare an array... preferred way
	//int c[];// aynisi, boyle de yazilabilir.
	
	b=new int[4];//.... initialize an array
	
	//2 way; all in 1 line(
	int[] array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=30;
	//access value from an array
	System.out.println(array[2]);
		
	//string le ornek.. all variables should be the same type int sa int, string ise string
	//lets create an array that will store classes
	String[] classes=new String[4];
	classes[0]="Java";
	classes[1]="SDLC";
	classes[2]="Manual Testing";
	classes[3]="GIT";
	//today we have java class
	System.out.println("today we have "+classes[0]);
	
	
	int[] nums=new int[3];
	nums[0]=1;
	nums[1]=2;	
	nums[2]=3;
	//how to change 1 to 100
	nums[0]=100;
	System.out.println(nums[0]);//100
	System.out.println(nums[0]+nums[2]);//100+3
	
	//the size of an array is fixed
	String[] names=new String[3];
	names[0]="Diana";
	names[1]="Seda";
	names[2]="Jaime";
	//names[3]="Olga"; only during runtime we will get an exception warning, 
	//error vermiyor, print etmiyor sadece
	
	
	System.out.println(names[0]);
	//we are putting less elements inside
	//as a result the complier gives default values which is 0 for int, 0.0 for double etc
	int[] numbers=new int[4];
	numbers[1]=100;
	numbers[3]=200;
			
	System.out.println(numbers[1]);
	
	//4 nurada verdigimiz element sayisi, 
	//normalde 1 variable sadece 1 value alir, arrayla bir variable a birden 
	//fazla value verebiliyoruz
		
	double[] number=new double[4];
	number[1]=100;
	number[3]=200;
	
	System.out.println(number[0]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}