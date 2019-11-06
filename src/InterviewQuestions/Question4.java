package InterviewQuestions;

public class Question4 {

	public static void main(String[] args) {
		//How to find out the part of the string from a string? 
		//What is substring? Find number of words in string?
		
		String a="Today is Sunny day";
	    
	    //Part of a String is called Substring. substring returns 
		//a new string from the part of a string.
	    //to find the part of the string we use substring -->string.substring(index)
	    String[] c=a.split(" ");
	    System.out.println(c.length);
	}

}
