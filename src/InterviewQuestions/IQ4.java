package InterviewQuestions;

public class IQ4 {

	public static void main(String[] args) {
		//How to find out the part of the string from a string? 
		//What is substring? Find number of words in string?
		//Part of a String is called Substring. substring returns 
		//a new string from the part of a string.
		//to find the part of the string we use substring -->string.substring(index)

		String str="Today is very cold outside";
		//String subString=str.substring(0,5);
		//System.out.println(subString);

		System.out.println(str.substring(0,5));
		
		/*
		 * step 1= split based on the space-->array of string
		 * step 2= find the length of an array
		 */
		
		String[] words=str.split(" ");
		System.out.println(words.length);
	}

}
