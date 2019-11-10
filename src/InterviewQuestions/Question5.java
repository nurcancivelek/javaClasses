package InterviewQuestions;

public class Question5 {

	public static void main(String[] args) {
	 //Write a java program to reverse String?
    //    Reverse a string word by word?
        String sentence="I will go to a wedding today";
        for(int i=sentence.length()-1;i>=0;i--) {
            System.out.print(sentence.charAt(i));
        }
        System.out.println();
        System.out.println("****************");
        
        String str="We practice interview questions";
        String[] array=str.split(" ");
        for(int i=array.length-1;i>=0;i--) {
        System.out.print(array[i]+" ");
        }

        String str1="Welcome to the Java Class.";
        char[] charArr=str1.toCharArray();
        
        for(int i=charArr.length-1; i>=0; i--) {
            System.out.print(charArr[i]);
        }
	}

}
