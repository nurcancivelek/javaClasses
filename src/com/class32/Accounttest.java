package com.class32;

public class Accounttest {
	public static void main(String[] args) {
		  Account ac=new Account();
		  ac.setAcc_no(7560504000l);
		  long acn=ac.setAcc_no(7560504000l);
		  ac.setName("Sumair");
		  String name=ac.setName("Sumair");
		  ac.setEmail("sumair@syntaxsolutions.com ");
		  String email=ac.setEmail("sumair@syntaxsolutions.com ");
		  ac.setAmount(500000.0);
		  double amount=ac.setAmount(500000.0);
		  System.out.println(acn+" "+name+" "+email+" "+amount);  
		  }

}
