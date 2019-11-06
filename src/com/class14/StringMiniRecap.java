package com.class14;

public class StringMiniRecap {

	public static void main(String[] args) {
		
		String str=new String("Hello");
	    String str3=new String("Hello"); // also we can write String str3=str;
	    System.out.println(str==str3);
	    
	    System.out.println("--------------------");
	    
	    String s1="hello";
	    String s2="hello";
	    System.out.println(s1==s2);
	   
	    System.out.println("--------------------");
	    
	    System.out.println(str);
	    String str2=str.replaceAll("Hello", "Bye");
	   System.out.println(str2);

	}

}
