package com.class31;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccountNumber(86873464); //cant call private methods.
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(200);
		double myBalance=acc.getBalance();
		acc.getAccountNumber();
		System.out.println(myBalance);
		
	int num=123;
	String.valueOf(num);//converts the data type to String
	//output="123"
	
	}

}
