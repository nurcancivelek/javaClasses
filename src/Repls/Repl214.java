package Repls;

public class Repl214 {
//
//	public static void main(String[] args) {
//		
//		Repl214 r=new Repl214();
//		r.comparingNumber(9);
//		
//
//	}
//	public static void comparingNumber(int number) {
//		if(number>10) {
//			System.out.println("Number is greater than 10");
//		}else {
//			System.out.println("Number is less than 10");
//		}
//	}
	
	//model solution
	
	public static void main(String[] args) {
		   comparingNumber1(9);
			}
			public static void main1(String[] args) {
			    comparingNumber1(9);
			  }
			  
			  public static void comparingNumber1(int number){
			    try {
						if (number > 10)
							System.out.println("Number is greater that 10");
						else
							throw new RuntimeException("Number is less than 10");
					} catch (RuntimeException e) {
						System.out.println(e.getMessage());
					}
		  }

}
