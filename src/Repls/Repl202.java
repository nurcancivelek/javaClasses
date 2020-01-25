package Repls;

import java.util.*;

public class Repl202 {

	public static void main(String[] args) {
		
		Set<String> number=new HashSet<>();
		number.add("first");
		number.add("second");
		number.add("third");
		number.add("fourth");
		number.add("fifth");
		
		 // Creating an Array
	     String[] arr = new String[number.size()];
	     number.toArray(arr);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String str : arr){
	        System.out.println(str);
	     }
	    
		
		
		
		
		
		
//		System.out.println("Array elements:");
//		Iterator<String> it=number.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		

	}

}

