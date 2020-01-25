package com.class32;

public class EncapsulationDemo1 {
	
	private String empName="John";
	private int empAge=30;

	public String getEmpName(String name){
	  //this.empName=empName;
	  return name;
	}
	public int getEmpAge(int age){
	  //this.empAge=empAge;
	  return age;
	}


}
