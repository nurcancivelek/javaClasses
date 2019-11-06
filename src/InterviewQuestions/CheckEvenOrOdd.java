package InterviewQuestions;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		
//int number;

Scanner scan=new Scanner(System.in);
System.out.println("Pls enter a number");
int num = scan.nextInt();

if(num%2==0) {
	System.out.println("Entered number is even");
}else {
	System.out.println("Entered number is odd");
}



	}

}
