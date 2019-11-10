package InterviewQuestions;

public class IQ6 {

	public static void main(String[] args) {
		//Write a Java Program to find whether a String is palindrome or not?
		
		/*
		 * if reversed string and original string are the same--> string is palindrome
		 * mom dad racecar kayak bob
		 * logic:
		 * step 1= reverse the string
		 * step 2= compare 2 stringf:
		 * if strings are equal-->palindrome
		 * else-->not palindrome
		 */
		String original="kayak";
		String reversed="";
		
		for(int i= original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k+a=ka+k
		}
		System.out.println(reversed);
		if(original.contentEquals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
	}

}
