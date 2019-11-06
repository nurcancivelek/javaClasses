package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		/*.split()
		 * This method splits this string around matches of the given regular expression.
		 */
		
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you prove your point.";
		
		String[] array=str.split(" ");
		//String[] array=str.split("\\s ");gives the same output
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------");
		//how many sentences are in the following string:
		String str1="Today is Sunday. It is a sunny day. We have java class";
		String[] array2=str1.split("\\.");
		System.out.println(array2.length);
		for(String string:array2) {
			//System.out.println(string);
			//System.out.println("to trim the spaces below:");
			System.out.println(string.trim());
		}
	}
}
