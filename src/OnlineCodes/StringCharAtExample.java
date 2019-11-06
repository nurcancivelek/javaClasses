package OnlineCodes;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to string handling tutorial";
		//This will return the first char of the string
		char ch1 = str.charAt(0);
			
		//This will return the 6th char of the string
		char ch2 = str.charAt(5);
			
		//This will return the 12th char of the string
		char ch3 = str.charAt(11);
			
		//This will return the 21st char of the string
		char ch4 = str.charAt(20);
			
		System.out.println("Character at 0 index is: "+ch1);
		System.out.println("Character at 5th index is: "+ch2);
		System.out.println("Character at 11th index is: "+ch3);
		System.out.println("Character at 20th index is: "+ch4);
		
		String str1 = "BeginnersBook";
		for(int i=0; i<=str1.length()-1; i++) {
			System.out.println(str1.charAt(i));
	}
		for(int i=str1.length()-1; i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
		
		
		
		
	}
}
