package InterviewQuestions;

public class Question3 {
	public static void main(String[] args) {
		//Find out how many alpha characters present in a string?
		
		String str="12345%$#@hello345aloha@#$*&";
		String str2= str.replaceAll("[^A-z]","");
		System.out.println(str2);
	}

}
