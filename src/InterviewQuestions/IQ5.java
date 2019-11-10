package InterviewQuestions;

public class IQ5 {

	public static void main(String[] args) {
		//Write a java program to reverse String?
	    //Reverse a string word by word?

		String given="Welcome to the java class";
		/*
		 * to reverse string
		 * step 1= split();
		 * array of string
		 * step 2= use for loop and use decrement
		 */
		
		//one way of doing this-->reversing by words
		String [] str= given.split("\\s")	;
		for(int i= str.length-1; i>=0; i--) {
			System.out.println(str[i]);
		}
		//Asel's way
		String reversed="";
		String [] str1= given.split("\\s")	;
		for(int i= str1.length-1; i>=0; i--) {
			reversed=reversed+str1[i]+ " ";
		}
		System.out.println(reversed);
		System.out.println("============");
		//reversing it all char by char
		char [] str11=given.toCharArray();
        for (int i = str11.length-1; i >=0 ; i--) {
            System.out.print(str11[i]);
        }
        System.out.println();
        System.out.println("------------");
        //write a java program to reverse a string
        //toCharArray(); charAt();
        String given1="Today is Java Class";
        char[] charArray=given1.toCharArray();
        for(int i= charArray.length-1; i>=0; i--) {
        	System.out.print(charArray[i]);
        }
        
        
        System.out.println("----using charAt-------");
        String str111 = "Hello world";
        System.out.println(str111.length());
        for (int i = str111.length() - 1; i >= 0; i--) {
            System.out.print(str111.charAt(i));
        }
        System.out.println("-----charAt()------");
        String word3="I love Java";
        for(int i=word3.length()-1; i>=0; i--) {
        	System.out.println(word3.charAt(i));
        }
        
	}

}
