package InterviewQuestions;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int[] arr=new int[12];
        arr[0]=1;
        arr[1]=1;
        for (int j = 1; j <arr.length-1; j++) {
            arr[j+1]= arr[j-1]+arr[j];
          System.out.print(arr[j-1]+" ");
	}
        System.out.println();
       
        int num = 0;
        int num2 = 1;
        int loop;
        int fibonacci;
        System.out.print(num2);
        for (loop = 1; loop <= 10; loop ++)
        {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
            System.out.print(" " + fibonacci);
        }
        System.out.println();
        int a=0;
        int b=1;
        int c;
        for(int i=0; i<10; i++) {
        	System.out.print(a+ " ");
        	c=a+b;
        	a=b;
        	b=c;
        }
        System.out.println();
        int kk=0, aa=1, bb=1;
        System.out.print("1 1 ");
        while (kk<=50) {
        	
        
        kk=aa+bb;
        System.out.print(kk+ " ");
        aa=bb;
        bb=kk;
	}
	}
}
