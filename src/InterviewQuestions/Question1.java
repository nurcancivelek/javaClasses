package InterviewQuestions;

public class Question1 {
	public static void main(String[] args) {
		//1.Write a program to swap 2 numbers without a temporary variable ? 
		//Swap 2 strings without a temporary variable?
		int a1=10;
        int b1=20;
        
        System.out.println("before: "+a1);
        
        
      a1=b1;
      System.out.println("after:"+a1);
     //Swap 2 strings without a temporary variable?
        int a = 10;
        int b = 20;
        System.out.println("before:a " + a);
        System.out.println("before:b "+b);
        a = a + b;//10+20=30
        b = a - b;//30-20=10 
        a = a - b;//30-10=20
        System.out.println("after:a " + a);
        System.out.println("after:b " + b);
        //int [] arr
		
	}

}
