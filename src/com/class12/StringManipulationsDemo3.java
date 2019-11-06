package com.class12;

public class StringManipulationsDemo3 {

	public static void main(String[] args) {
		//isEmpty()
		/*
		 * this method checks if a string is empty or not.
		 * it returns true if the given string is empty
		 * else it returns false
		 */
		
		String str="";
		System.out.println("is this string "+str.isEmpty());
		String str2="Hello";
		System.out.println("is this string "+str2.isEmpty());
		
		System.out.println();
		
		if(!str.isEmpty()) {
			System.out.println("this is not empty");
		}else {
			System.err.println("this is empty");
		}
		System.out.println("------------");
		
		String sentence="Each day has a promise to brighten up the day, \n But first you must allow the sun to come your way";
		System.out.println(sentence);
		
		System.out.println("***************");
		
		//.concat method
		//this method appends one string to the end of another.
		//the method returns a string with the value of the
		//string passed in to the market appended to the end
		//of the string used to invoke this method
		
		String str3="Hello";
		String str4="World";
		String str5="People";
		System.out.println(str3+" "+str4+" "+str5);
		System.out.println(str3.concat(str4));
		System.out.println(str3.concat(" "+str4));
		System.out.println(str3.concat(str4).concat(str5));
		
		System.out.println("---------");
		
		//this method returns a copy of the string
		//with leading and trailing whitescape omitted
		String str6= "How are you?";
		System.out.println(str6.trim());
		
		System.out.println("************");
		
		//this method returns the character located at the string's specified index
		//the string indexes start from zero
		String str7= "We might be done early today";
		System.out.println(str7.charAt(3));
		
		System.out.println("88888888888888");
		
		//INDEXOFV METHOD
		//this method returns the index within this string of the
		//first occurrence of the specified character or -1
		//if the character does not occur
		String str8="We might mnot be donem early today";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m', 12));//HANGI INDEXTEN SONRA SAYSIN DIYE 
		System.out.println(str8.indexOf('z', 10));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
