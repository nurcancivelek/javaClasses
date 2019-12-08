package JavaMonday;

public class November11 {
	
	public static void main(String[] args) {
		//factorial of 8.
		int number=8;
		int factorial=1;
		for(int i=1; i<=number; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		//sum of digits of a number:
		
		int a= 654321;
		int sum=0;
		for(int i=0; i<=6; i++) {// why can't we say i<=a.length?
			sum+=i;
			
		}
		System.out.println(sum);
	
		
		//armstrong number:
		//25; (2*2)+(5*5)= 29 not armstrong number-->if it 
		//was 25 then it would be armstrong number
	
	/*
	 * data types in java:
	 * primitive:char, boolean=false,byte=0, short=0, 
	 * int=0, long=0L, float=0.0f, double=0.0d
	 * non-primitive: string=null
	 */

		/*how to test a microwave
		 * start by requirements:
		 * learn what kind of model it is?
		 * the capacity of the oven
		 * how many watts
		 * i would measure the dimensions of the oven 
		 * to verify it is correct with the user book
		 * then start it with open door, unplugged, empty...
		 */
	
	}
}
