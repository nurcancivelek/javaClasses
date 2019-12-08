package com.class26;

public class FullTime extends Employee{

	int bonus;
	//int salary;
	public void getPaid() {//overriding
		System.out.println("Fulltime employee gets  "+salary+" and bonus "+bonus);
}
}