package InterviewQuestions;

public class IQ7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		//prime number or not
		
		/*
		 * prime number is a number that has to meet 2 conditions:
		 * it should be divisible by 1 and itself ONLY
		 * 2,3,5.7.11.13.17.19.23.....
		 * /1 is not a prime number
		 */
		
		//take range of numbers from 2-100 and print all primes
		//2,3(2,3), 4(2,3,4), 5(2,3,4,5)6(2,3,4,5,6) 
		//her yeni sayiya geldiginde en basindan baslar
		
		int num=5; 
		boolean isPrime=true;
		if(num==0 || num==1) {//0 ve 1 prime olmadigi icin en basinda onlari elemek gerekiyor
			isPrime=false;
		}else {
		
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;	
					break;//ilk bolunen sayi oldugunda i, o zaman break etsin
					//cunku it doesnt make sense to run the code anymore
				}
			}
		}
				if(isPrime) {
					System.out.println(num+" is a Prime number");
				}else {
					System.out.println(num+" is not a prime number");
				}
			
			
	}
}
