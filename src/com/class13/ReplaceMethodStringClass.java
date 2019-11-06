package com.class13;

public class ReplaceMethodStringClass {
	
	public static void main(String[] args) {
		
		/*
		 * .replace()
		 * this method returns a new string resulting
		 * from replacing all occurrences of sequence of string oldChar
		 * in this string with newCharsequance
		 */
		String str="Hello Dear Dan, how are you Dan, How you been?";
		
		System.out.println("-------.REPLACE()---------");
		
		System.out.println(str.replace('e','z'));
		System.out.println(str.replace("Dear Dan","Respected Ben"));
		
		System.out.println("-----.REPLACEFIRST()-----");
		System.out.println(str.replaceFirst("Dan","Ali"));
	}

}
