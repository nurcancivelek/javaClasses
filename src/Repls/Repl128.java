package Repls;

public class Repl128 {
	
//	Declare a variable in class SubClass as shown below:
//		Protected int integerNumber = 222;
//
//	Then in class Subclass create a void method with protected 
//	access modifier that will print the value of above declared variable. 
//
//	then in class Main try to call the method you just
//	created twice and run the program. 
//
//	Output hint: 
//	222
//	222
	 protected int integerNumber = 222;
	 protected void print(){
		    for(int i=1; i<3; i++){
		    System.out.println(integerNumber);
		  }
		  }
	}

//	class Main {
//		//import Repl128.*;	
//	  public static void main(String[] args) {
//		  Main m=new Main();
//		  m.print();
//		  
//	    
//	    // m.integerNumber=
//	    //m.print();
//	  }
//
//		protected void print() {
//			for(int i=1; i<3; i++){
//			    System.out.println(222);
//			  
//			}	
//		}
//	}
//	

