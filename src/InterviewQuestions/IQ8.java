package InterviewQuestions;

public class IQ8 {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a, b, c;
		a=0;
		b=1;
		
		for(int i=0; i<10; i++) {
			System.out.print(a +" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		//another way
		 int a1=0;
	        int b1=1;
	        int sum=0;
	        for (int i = 1; sum < 100; i++) {
	            System.out.print(sum + ", ");
	            sum=a1+b1;
	            b1=a1;
	            a1=sum;
	            
	        }
	        System.out.println();
	        int[] f = new int[10];
            
            for(int i = 0; i<f.length;i++) {
                if(i==0 || i==1) {
                    f[i] = i;
                }
                else {
                
                    f[i] = f[i-1] + f[i-2];
                }
                System.out.print(f[i] + " ");
            }
	}
}
