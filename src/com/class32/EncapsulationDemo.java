package com.class32;

public class EncapsulationDemo {
	private String empName;
	private int empAge;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	

}

class Main{
	public static void main(String[] args) {
	    EncapsulationDemo ee=new EncapsulationDemo();
	    ee.setEmpName("John");
	    String name=ee.getEmpName();
	    ee.setEmpAge(30);
	    int age=ee.getEmpAge();
	    System.out.println("Employee Name: "+name);
	    System.out.println("Employee Age: "+age);
	  }
	   
}
