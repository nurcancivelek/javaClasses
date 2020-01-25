package Repls;

public class Repl212 {
	
	 public static void main(String[] args) throws InterruptedException {

	     try{
	    	 int a=10, b=0; 
	       int result=a/b;
	       System.out.println(result);
	       Thread.sleep(2000);
	    
	     }catch(ArithmeticException e){
	      System.out.println(e.getMessage()); 
	     }
	     
	     //model solution
	     
	     
	  }
	 
	 public static void main1(String[] args) {
	     int a=10, b=0, result;
	    
	 
	  // try block
	 
	  try {
	    result  = a / b;
	    System.out.println("Result = " + result);
	  }
	 
	  // catch block
	 
	  catch (ArithmeticException e) {
	    System.out.println(e.getMessage());
	  }
	  }

}
