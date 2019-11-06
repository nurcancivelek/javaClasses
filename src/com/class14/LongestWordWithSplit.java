package com.class14;

public class LongestWordWithSplit {
	
	public static void main(String[] args) {
String str = "Video provides a powerful way to help you prove your point.";
        
        String [] array = str.split(" ");
        int max = array[0].length();
        
        for(int i=0;i<array.length;i++) {
            array[i].replace(".","");
            if(array[i].length()>max) {
                max = array[i].length(); 
                System.out.println("Longest word in the sentence is "
                                    +array[i]+" and length is "+array[i].length() );
            }
        }

	}

}
