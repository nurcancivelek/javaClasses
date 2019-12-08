package com.class18;

public class Task {
	//task 1
	void number(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else if(num2>num1){
			System.out.println(num2+" is bigger than "+num1);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	void evenOrOdd( int numm) {
		if(numm%2==0) {
			System.out.println(numm+ " is even");
		}else {
			System.out.println(numm+ " is odd");
		}
	}
	
	//task 3
	void palindrome(String word) {
		String reverse = "";
		for (int i =word.length() - 1; i >= 0; i--) {
		      reverse = reverse + word.charAt(i);
		} 
		    if (word.equals(reverse)) {
		      System.out.println("The string is a palindrome.");
		    } else {
		      System.out.println("The string isn't a palindrome.");
		}
	}
	
	public static void main(String[] args) {
		Task t1=new Task();
		t1.number(8, 6);
		t1.number(44, 78);
		t1.number(88, 88);
		Task t2=new Task();
		t2.evenOrOdd(36);
		t2.evenOrOdd(99);
		
		Task t3=new Task();
		t3.palindrome("kayak");
		t3.palindrome("made");
	}

}
