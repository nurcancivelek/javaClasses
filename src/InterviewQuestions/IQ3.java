package InterviewQuestions;

public class IQ3 {

	public static void main(String[] args) {
		//Find out how many alpha characters present in a string?
		
		String str="Hello 68764456** ,##45&&^%$!!!";
		//System.out.println(str.replaceAll("[^a-zA-Z]",""));
		str=str.replaceAll("[^A-Za-z]","");
		System.out.println(str.length());
	}

}
