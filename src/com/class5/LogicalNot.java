package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		boolean b1 = !true;
		boolean b2 = !false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		//if traffic-->late, else-->on time
		if(!traffic) { //using ! we are reverting condition
			System.out.println("on time");
			
		}else {
			
			System.out.println("late");
		}
		
		boolean isRain=false;
		
		if(!isRain) { //we make it true
			System.out.println("take an umbrella");
		}else {
			System.out.println("dont take an umbrella");
		}
		
		//lets compare 2 numbers using not operator
		
		int num1=10;
		int num2=11;
		if(num1==num2) {
			System.out.println("numbers are equal");
		}else {
			System.out.println("numbers are not equal");
		}
		if(!(num1==num2)) {
			System.out.println("numbers are not equal");
		}else {
			System.out.println("numbers are equal");
		}
		//if name is not Peko or Seco then you are not my sister
		String name="Peko";
		String name2="Seco";
		//true or false-->true add NOT-->false
		
		if(!(name.equals("Peko") || name.equals("Seco"))) {
			System.out.println("we are  not sisters");
		}else {
			System.out.println("we are sisters");
		}
				
				

	
	
	}
	
}
