package com.class13;

public class Task2 {
	
	public static void main(String[] args) {
	//Create a String and print it in reverse order (Sunday → yadnuS).
		
	
	String str="Sunday";
	
	for(int i=str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println();
	char[] day=str.toCharArray();
	for(int i=5; i>=0; i--) {
		System.out.print(day [i]);
	}
	System.out.println();
	for(int a=str.length()-1; a>=0; a--) {
        System.out.print(str.charAt(a));
    }
//	To whom who didn't understand Task1:
//		S=[0] , u=[1], n=[2], d=[3], a=[4], y=[5]
//		day.length() = 6; But
//		we need 54321 to get ---> yadnuS
//		for (i = start with 5 (length6 - 1 = 5))
        
    System.out.println();
    
	//Create a String and if the String is not empty perform the following:
	//if the String has an odd number of characters and 
	//has 3 or more characters, print the character in the middle of the String.
	
    String str2="aloha";
    int middle=str2.length()/2;
    if(str2.isEmpty()) {
    	
    }else {
    	if(str2.length()%2!=0 && str2.length() >=3) {
    		System.out.println(str2.charAt(str2.length() / 2));
    		System.out.println(str2.charAt(middle));
    	}
    }
	
    String str3 = "Hellousasaadddd";
    
    	if (!str3.isEmpty()) {
    		if (str3.length() % 2  != 0) {
    			System.out.print(str3.charAt(str3.length()/2));
    		}else {
    			System.err.println("Error");
    		}
    	}
	}
}
