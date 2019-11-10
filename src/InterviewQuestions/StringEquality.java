package InterviewQuestions;

public class StringEquality {

	public static void main(String[] args) {
		
		String str="Hello";
		String str1="Hello";//a new object is not created
		String str2=new String ("Hello");//a new object is created
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("-------------------");
		System.out.println(str==str1);
		System.out.println(str==str2);
		
		/*
		 * java has two types of memory:
		 * 1.stack:
		 * 2.heap:
		 */

	}

}
