package InterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("pls enter a number");
	int num=scan.nextInt();
	int reverse=scan.nextInt();
	
	while(num !=0) {
		reverse=reverse*10;
		reverse=reverse+num%10;
		num=num/10;
				
	}
	System.out.println("Reverse of input number is: "+reverse);
}	
}
