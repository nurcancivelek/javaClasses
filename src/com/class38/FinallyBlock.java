package com.class38;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str="Hello";
		try {
			//char character=str.charAt(0);
			char character=str.charAt(20);//new StringIndexOutOfBoundsException()
			System.out.println(character);
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			
		}finally {//finally code will execute no matter what
			System.out.println("i am a finally block");
		}
		System.out.println("End of the code");

	}

}
