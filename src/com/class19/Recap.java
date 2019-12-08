package com.class19;

public class Recap {
	void sum(int num1, int num2) {
		int c=num1+num2;
		System.out.println("the sum of 2 numbers is= "+c);
	}
	//create method to display hello 5 times
	void sayHello(int times) {//parameter koymadanda olur: void sayhello()
				for(int i=0; i<times; i++) {//no parameter olursa i<5 koymali
			System.out.println("Hello");
		}
	}
	//create method to say sth #number of times
	
	void saySomething(String word, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.sum(10, 30);
		System.out.println("----------------");
		
		obj.sayHello(5);
		obj.saySomething("java",5);
		//obj.saySomething(5, "Welcome"); compiler error, must follow the order.
	}
}
