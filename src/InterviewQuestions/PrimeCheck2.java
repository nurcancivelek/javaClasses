package InterviewQuestions;

public class PrimeCheck2 {

	public static void main(String[] args) {
		int num=25;
		boolean isPrime=false; 
		
		for(int i=2; i<num/2; i++) {//to make it simpler i<num\2
			if(num%i==0) {////to make it simpler i<num\2.. to decrease looping
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a Prime number");
		}else {
			System.out.println(num+" is NOT a Prime number");
		}
	}

}
