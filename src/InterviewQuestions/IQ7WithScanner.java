package InterviewQuestions;

import java.util.Scanner;

public class IQ7WithScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check prime or not");
        int num = scan.nextInt();
        boolean isPrime = true;
        if(num==0 || num==1){
              isPrime=false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
        scan.close();

	}

}
